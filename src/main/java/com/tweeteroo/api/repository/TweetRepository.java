package com.tweeteroo.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweeteroo.api.model.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
	List<Tweet> findAllByUsername(String username);
}
