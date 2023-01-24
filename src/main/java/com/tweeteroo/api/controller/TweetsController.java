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
import com.tweeteroo.api.dto.GetTweetsDTO;
import com.tweeteroo.api.repository.TweetRepository;
import com.tweeteroo.api.repository.UserRepository;
import com.tweeteroo.api.model.Tweet;

@RestController
@RequestMapping("/tweets")
public class TweetsController {
	@Autowired
	private TweetRepository tweetRepository;

	@Autowired
	private UserRepository userRepository;

	@GetMapping
	public List<Tweet> getAll() {
		return tweetRepository.findAll();
	}

	@GetMapping("/{username}")
	public List<Tweet> getById(@PathVariable String username) {
		return tweetRepository.findAllByUsername(username);
	}

	@PostMapping
	public void create(@RequestBody CreateTweetDTO body) {
		String avatar = userRepository.findByUsername(body.username()).getAvatar();
		GetTweetsDTO tweet = new GetTweetsDTO(body.username(), avatar, body.tweet());
		tweetRepository.save(new Tweet(tweet));
	}
}
