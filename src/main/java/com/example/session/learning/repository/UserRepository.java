package com.example.session.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.session.learning.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
