package com.java.MyPass.auth;

import org.apache.coyote.Request;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final TokenService tokenService;

    public AuthController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    record LoginRequest(String username, String password) {}
    record LoginResponse(String token) {}

    @PostMapping("login")
    public LoginResponse login(@RequestBody LoginRequest loginRequest){
        var jwt = tokenService.generateToken(loginRequest.username());
        return new LoginResponse(jwt);
    }
}

