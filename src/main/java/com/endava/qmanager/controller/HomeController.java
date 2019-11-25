package com.endava.qmanager.controller;

import com.endava.qmanager.domain.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static com.endava.qmanager.domain.model.User.Role.ROLE_ADMINISTRATOR;

@Controller
@RequiredArgsConstructor
@Slf4j
public class HomeController {

    private User user;

    @GetMapping(value = "/")
    public String homePage() {
        return "home";
    }

    @GetMapping(value = "/login")
    public String login() {
        log.info("User should enter credentials");
        return "login";
    }

   /* @GetMapping(value = "/")
    public String homePage() {
        log.info("User should enter credentials");
        User.Role role = user.getRole();
        if (role==ROLE_ADMINISTRATOR){
        return "admin";
    }else{
            return "home";
        }*/

}
