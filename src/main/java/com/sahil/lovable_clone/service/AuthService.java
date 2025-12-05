package com.sahil.lovable_clone.service;

import com.sahil.lovable_clone.dto.auth.AuthResponse;
import com.sahil.lovable_clone.dto.auth.LoginRequest;
import com.sahil.lovable_clone.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
