package com.zohanubis.controller;

import com.zohanubis.exception.UserException;
import com.zohanubis.model.User;
import com.zohanubis.repository.UserRepository;
import com.zohanubis.response.AuthResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private UserRepository userRepository;

    public AuthController(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public ResponseEntity<AuthResponse> createUserHandler(@RequestBody User user) throws UserException{
        String email = user.getEmail();
        String password = user.getPassword();
        String firstString = user.getFirstName();
        String lastNString = user.getLastName();

        User isEmailExist= UserRepository
    }
}
