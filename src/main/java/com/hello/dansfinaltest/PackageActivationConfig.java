package com.hello.dansfinaltest;

import com.hello.dansfinaltest.model.PackageActivation;
import com.hello.dansfinaltest.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PackageActivationConfig {

    private static final Logger log = LoggerFactory.getLogger(UserConfig.class);

    @Bean
    CommandLineRunner initDatabaseT(PackageActivationRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new PackageActivation("id1",100,"prod1")));
            log.info("Preloading " + repository.save(new PackageActivation("id2",200,"prod2")));
        };
    }
}
