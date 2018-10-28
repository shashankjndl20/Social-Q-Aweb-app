package com.upgrad.quora.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upgrad.quora.api.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUserName(String username);
	Optional<User> findByUuid(String uuid);
	
}
