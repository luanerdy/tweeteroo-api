package com.tweeteroo.api.dto;

import jakarta.validation.constraints.NotBlank;

public record CreateUserDTO(@NotBlank String username, @NotBlank String avatar) {
}
