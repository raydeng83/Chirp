package com.backend.controller;

import com.backend.Repository.UserRepository;
import com.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

/**
 * Created by z00382545 on 11/20/16.
 */

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/tokenValidation")
    public ResponseEntity<String> tokenValidation(@Param("token") String token, @Param("email") String email) throws IOException {
        ResponseEntity<String> responseEntity = userService.validateToken(token);

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            userService.setUserSession(userRepository.findByEmail(email).getUsername());
        }

        return responseEntity;
    }
}
