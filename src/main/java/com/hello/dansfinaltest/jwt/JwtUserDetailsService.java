package com.hello.dansfinaltest.jwt;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
//import com.hello.dansfinaltest.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("test".equals(username)) {
            return new User("test", "$2a$10$NXw9LLfsx8GiCS9UvnpEq.2bye6EG5PHXKFH4Kjtax8l7D2papw96",
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}