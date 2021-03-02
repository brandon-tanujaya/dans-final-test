package com.hello.dansfinaltest;

import com.hello.dansfinaltest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

interface UserRepository extends JpaRepository<User, Long> {
    List<User> findUserByName(String name);
}