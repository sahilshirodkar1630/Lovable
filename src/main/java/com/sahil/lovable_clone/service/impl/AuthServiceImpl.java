package com.sahil.lovable_clone.service.impl;

import com.sahil.lovable_clone.dto.project.ProjectRequest;
import com.sahil.lovable_clone.dto.auth.AuthResponse;
import com.sahil.lovable_clone.dto.auth.LoginRequest;
import com.sahil.lovable_clone.dto.auth.SignupRequest;

import com.sahil.lovable_clone.service.AuthService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponse signup(SignupRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
