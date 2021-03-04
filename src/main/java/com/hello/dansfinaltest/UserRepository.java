package com.hello.dansfinaltest;

import com.hello.dansfinaltest.model.UserCustom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

interface UserRepository extends JpaRepository<UserCustom, Long> {
    List<UserCustom> findUserByName(String name);
}