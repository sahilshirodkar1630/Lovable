package com.sahil.lovable_clone.dto.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record SignupRequest(
        @Email @NotBlank String username,
        String name,
        String password) {
}
