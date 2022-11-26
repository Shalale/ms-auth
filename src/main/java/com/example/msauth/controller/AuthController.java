package com.example.msauth.controller;

import com.example.msauth.model.dto.SignInDto;
import com.example.msauth.model.dto.TokenDto;
import com.example.msauth.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/tokens")
public class AuthController {
    private final AuthService authService;

    @PostMapping("/sign-in")
    public TokenDto signIn(@RequestBody SignInDto dto){
        return authService.signIn(dto);
    }
}
