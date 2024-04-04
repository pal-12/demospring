package com.nagarro.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.demo.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    // No additional methods required for basic CRUD operations

}
