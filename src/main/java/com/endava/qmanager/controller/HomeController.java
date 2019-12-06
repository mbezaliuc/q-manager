package com.endava.qmanager.controller;

import com.endava.qmanager.domain.model.User;
import com.endava.qmanager.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static com.endava.qmanager.domain.model.Role.ROLE_ADMINISTRATOR;


@Controller
@RequiredArgsConstructor
@Slf4j
public class HomeController {
    private final UserRepository userRepository;

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

    @RequestMapping(value = "/redirectPage", method = {RequestMethod.GET, RequestMethod.POST})
    public String redirectPage(Model model){
        if (SecurityContextHolder.getContext().getAuthentication().getAuthorities().contains(ROLE_ADMINISTRATOR)){

            return "redirect:/admin";
        }else{
            return "home";
        }
    }

}
