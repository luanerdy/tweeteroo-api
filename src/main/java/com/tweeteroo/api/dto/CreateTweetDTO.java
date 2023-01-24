package com.tweeteroo.api.dto;

import jakarta.validation.constraints.NotBlank;

public record CreateTweetDTO(
		@NotBlank String username,
		@NotBlank String tweet) {

}
