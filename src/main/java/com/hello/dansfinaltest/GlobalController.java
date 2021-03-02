package com.hello.dansfinaltest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hello.dansfinaltest.jwt.JwtTokenUtil;
import com.hello.dansfinaltest.jwt.JwtUserDetailsService;
import com.hello.dansfinaltest.model.Job;
import com.hello.dansfinaltest.model.PackageActivation;
import com.hello.dansfinaltest.model.User;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.*;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

@RestController
public class GlobalController {

    private final UserRepository userRepository;
    private final PackageActivationRepository packageActivationRepository;
    private final RedisTemplate<String, String> redisTemplate;
    private final AuthenticationManager authenticationManager;
    private final JwtTokenUtil jwtTokenUtil;
    private final JwtUserDetailsService userDetailsService;

    Jedis jedis = new Jedis();

    GlobalController(UserRepository userRepository,
                     PackageActivationRepository packageActivationRepository,
                     RedisTemplate<String, String> redisTemplate,
                     JwtTokenUtil jwtTokenUtil,
                     JwtUserDetailsService userDetailsService,
                     AuthenticationManager authenticationManager){
        this.userRepository = userRepository;
        this.packageActivationRepository = packageActivationRepository;
        this.redisTemplate = redisTemplate;
        this.jwtTokenUtil = jwtTokenUtil;
        this.userDetailsService = userDetailsService;
        this.authenticationManager = authenticationManager;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    //Login API
//    @PostMapping("/api/auth")
//    User authenticate(@RequestBody User user){
//        return userRepository.findUserByName(user.getName()).get(0);
//    }
    @RequestMapping(value = "/api/auth", method = RequestMethod.POST)
    public String createAuthenticationToken(@RequestBody User user) throws Exception {

        authenticate(user.getName(), user.getPassword());

        final UserDetails userDetails = userDetailsService
                .loadUserByUsername(user.getName());

        final String token = jwtTokenUtil.generateToken(userDetails);

        return token;
    }

    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }

    //Browse Product
    @GetMapping("/api/product")
    void getAll(RestTemplate restTemplate) throws JsonProcessingException {
        String url = "http://dev3.dansmultipro.co.id/mock/preprod-web/scrt/esb/v1/offer/reseller?menu_id=ML3_DP_03";
        ResponseEntity<String> response
                = restTemplate.getForEntity(url, String.class);

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(response.getBody());
        JsonNode name = root.path("name");

        System.out.println(name);
    }
//    @GetMapping("/api/product")
//    Job[] getAll(RestTemplate restTemplate){
//        Job[] jobList = restTemplate.getForObject("https://jobs.github.com/positions.json", Job[].class);
//
//        return jobList;
//    }

    //Initiate Package Activation
    @PostMapping("/api/package-activation")
    UUID initiatePackageActivation(@RequestBody PackageActivation packageActivation){
        String msisdn = packageActivation.getMsisdn();
        String productId = packageActivation.getProduct_id();
        UUID uuid = UUID.randomUUID();
        jedis.hset(uuid.toString(), "msisdn", msisdn);
        jedis.hset(uuid.toString(), "productId", productId);
        return uuid;
    }

    //Confirm Package Activation
    @PostMapping("/api/package-activation/confirmation")
    String confirmPackageActivation(@RequestBody Map<String,String> requestParams, RestTemplate restTemplate) throws JSONException {
        String token = requestParams.get("token");
        String msisdn = jedis.hget(requestParams.get("token"), "msisdn");
        String productId = jedis.hget(requestParams.get("token"), "productId");
        //System.out.println(token + msisdn + productId);

        String url = "http://dev3.dansmultipro.co.id/mock/sit-web/secure/esb/v1/order/reseller";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("token", token);
        jsonObject.put("msisdn", msisdn);
        jsonObject.put("productId", productId);

        HttpEntity<String> request = new HttpEntity<String>(jsonObject.toString(), headers);

        String jsonResult = restTemplate.postForObject(url, request, String.class);

        return "...";
    }

    //Get Transaction History
    @GetMapping("/api/transaction/history")
    List<PackageActivation> getAllTransactions(){
        return packageActivationRepository.findAll();
    }

    //Get Transaction History
    @GetMapping("/api/transaction/history/{id}")
    Optional<PackageActivation> getTransaction(@PathVariable Long id){
        return packageActivationRepository.findById(id);
    }
}
