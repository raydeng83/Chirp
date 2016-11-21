package com.backend.controller;

import com.backend.Repository.UserRepository;
import com.backend.entity.User;
import com.backend.service.UserService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public ResponseEntity tokenValidation(@Param("token") String token, @Param("email") String email) throws IOException {
        HttpStatus httpStatus = userService.validateToken(token);

        if (httpStatus.is2xxSuccessful()) {
            User user = userRepository.findByEmail(email);
            Map<String, String> entity = new HashMap<>();
            entity.put("email", email);

            if (user != null) {
                userService.setUserSession(user.getUsername());
                entity.put("username", user.getUsername());

                return new ResponseEntity<>(entity, httpStatus);
            } else {
                entity.put("username", "");

                return new ResponseEntity<>(entity, httpStatus);
            }
        }

        return new ResponseEntity<>(httpStatus);
    }
}
