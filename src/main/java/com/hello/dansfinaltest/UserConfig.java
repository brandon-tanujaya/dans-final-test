package com.hello.dansfinaltest;

import com.hello.dansfinaltest.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    private static final Logger log = LoggerFactory.getLogger(UserConfig.class);

    @Bean
    CommandLineRunner initDatabase(UserRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new User("user1", "pass1")));
            log.info("Preloading " + repository.save(new User("user2", "pass2")));
        };
    }

}
