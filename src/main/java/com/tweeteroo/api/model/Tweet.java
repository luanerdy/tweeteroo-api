package com.tweeteroo.api.model;

import com.tweeteroo.api.dto.GetTweetsDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Tweet {
	public Tweet(GetTweetsDTO tweet) {
		this.text  = tweet.text();
		this.username = tweet.username();
		this.avatar = tweet.avatar();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(length = 50, nullable = false)
	private String username;

	@Column(length = 200, nullable = false)
	private String avatar;

	@Column(length = 300, nullable = false)
	private String text;
}
