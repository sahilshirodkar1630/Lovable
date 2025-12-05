package com.sahil.lovable_clone.service;

import com.sahil.lovable_clone.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
