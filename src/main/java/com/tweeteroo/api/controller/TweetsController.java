package com.tweeteroo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweeteroo.api.dto.CreateTweetDTO;
import com.tweeteroo.api.repository.TweetRepository;
import com.tweeteroo.api.model.Tweet;

@RestController
@RequestMapping("/tweets")
public class TweetsController {
	@Autowired
	private TweetRepository repository;

	@GetMapping
	public List<Tweet> getAll() {
		return repository.findAll();
	}

	@GetMapping("/{username}")
	public List<Tweet> getById(@PathVariable String username) {
		return repository.findAllByUsername(username);
	}

	@PostMapping
	public void create(@RequestBody CreateTweetDTO tweet) {
	}
}
