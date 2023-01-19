package com.tweeteroo.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweeteroo.api.dto.TweetDTO;

@RestController
@RequestMapping("/tweets")
public class TweetsController {
	@GetMapping
	public String getAll() {
		return "All Tweets";
	}

	@GetMapping("/{id}")
	public String getById(@PathVariable int id) {
		return "Tweet " + id;
	}

	@PostMapping
	public void create(@RequestBody TweetDTO tweet) {
	}
}
