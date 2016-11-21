package com.backend.controller;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by z00382545 on 11/19/16.
 */

@Controller
public class HomeController {
    @RequestMapping("/login")
    public String index() {
        return "login";
    }


}
