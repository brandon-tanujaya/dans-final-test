package com.hello.dansfinaltest.model.audit;

import org.springframework.data.domain.AuditorAware;

import java.util.Arrays;
import java.util.Optional;
import java.util.Random;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        // Random choice of three users
        return Optional.of(Arrays.asList("admin1", "admin2", "admin3")
                .get(new Random().nextInt(3)));
    }



}