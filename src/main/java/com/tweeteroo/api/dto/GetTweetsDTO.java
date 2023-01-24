package com.tweeteroo.api.dto;

import jakarta.validation.constraints.NotBlank;

public record GetTweetsDTO(@NotBlank String username, @NotBlank String avatar, @NotBlank String text) {

}
