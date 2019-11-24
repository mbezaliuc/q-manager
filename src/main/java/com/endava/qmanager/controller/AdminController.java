package com.endava.qmanager.controller;

import com.endava.qmanager.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
//@RequiredArgsConstructor
@Slf4j

public class AdminController {

    private UserService userService;

    public AdminController(UserService userService) {
        this.userService = userService;
        userService.init();
    }

    @GetMapping
    public String adminPage(Model model) {
            model.addAttribute("admin",userService.getUser());
            return "admin";

    }

}
