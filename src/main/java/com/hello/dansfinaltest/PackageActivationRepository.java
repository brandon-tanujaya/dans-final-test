package com.hello.dansfinaltest;

import com.hello.dansfinaltest.model.PackageActivation;
import org.springframework.data.jpa.repository.JpaRepository;

interface PackageActivationRepository extends JpaRepository<PackageActivation, Long> {
}
