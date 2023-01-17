package com.tweeteroo.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tweets")
public class TweetsController {
	@GetMapping
	public String getAll() {
		return "All Tweets";
	}
}
