package com.example.expose_authenticationManager_bean;

import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@AllArgsConstructor
public class AuthController {
    private final AuthenticationManager authenticationManager;
    @PostMapping("/llogin")
    public String login(@RequestBody Credential credentials) {
        System.out.println(credentials);
        System.out.println(credentials);
        try {
            Authentication auth = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(credentials.getUsername(), credentials.getPassword())
            );
            return "Authenticated: " + auth.isAuthenticated();
        } catch (AuthenticationException e) {
            return "Authentication failed: " + e.getMessage();
        }

//        return "huhuh";
    }

    @GetMapping("/demo")
    public String demo() {
        return "Just demsssdso";
    }
}
