package com.developerSam.Product.Repository;

import com.developerSam.Product.Entity.AirlineCustomer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AirlineCustomer,Long> {
}
