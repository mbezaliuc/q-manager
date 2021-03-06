package com.endava.qmanager.controller;

import com.endava.qmanager.domain.dto.UserDto;
import com.endava.qmanager.domain.model.User;
import com.endava.qmanager.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/register")
@RequiredArgsConstructor
@Slf4j
public class RegistrationController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @GetMapping
    public String registerForm() {
        return "registration";
    }

    @PostMapping
    public String processRegistration(@Valid UserDto form, Errors errors) {
        if (errors.hasErrors()) {
            return "registration";
        }
        User save = userRepository.save(form.toUser(passwordEncoder));
        log.info("{}", save);
        return "redirect:/login";
    }
}