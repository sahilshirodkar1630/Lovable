package com.sahil.lovable_clone.dto.auth;

import com.sahil.lovable_clone.entity.User;

public record AuthResponse(String token, UserProfileResponse user) {

}
