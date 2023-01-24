package com.tweeteroo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweeteroo.api.model.TUser;

public interface UserRepository extends JpaRepository<TUser, Long> {
	TUser findByUsername(String username);
}
