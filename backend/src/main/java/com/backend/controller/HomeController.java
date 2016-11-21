package com.backend.controller;

import com.backend.entity.User;
import com.backend.entity.security.Role;
import com.backend.entity.security.UserRole;
import com.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by z00382545 on 11/19/16.
 */

@Controller
public class HomeController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String index() {
        return "login";
    }


}
