package com.tweeteroo.api.model;

import com.tweeteroo.api.dto.CreateUserDTO;

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
public class TUser {
	public TUser(CreateUserDTO user) {
		this.avatar = user.avatar();
		this.username = user.username();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(length = 50, nullable = false)
	private String username;

	@Column(length = 200, nullable = false)
	private String avatar;
}
