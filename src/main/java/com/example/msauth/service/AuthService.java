package com.example.msauth.service;

import com.example.msauth.client.UserClient;
import com.example.msauth.model.dto.SignInDto;
import com.example.msauth.model.dto.TokenDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final TokenService tokenService;
    private final UserClient userClient;

    public TokenDto signIn(SignInDto dto){
        String userId = Long.toString(userClient.getUserId(dto.getUsername()));
        return tokenService.generateToken(userId , 50);
    }
}
