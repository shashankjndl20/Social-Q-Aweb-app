package com.upgrad.quora.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upgrad.quora.api.entity.UserAuth;

@Repository
public interface UserAuthRepo extends JpaRepository<UserAuth, Integer> {

	UserAuth findByUuidAndAccessToken(String uuid, String accessToken);
	UserAuth findByAccessToken(String accessToken);
}
