package com.endava.qmanager.controller;

import com.endava.qmanager.domain.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @GetMapping(value = "/user")
    public UserDto user() {
        return new UserDto();
    }
}
