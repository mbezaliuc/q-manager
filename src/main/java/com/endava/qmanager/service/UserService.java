package com.endava.qmanager.service;

import com.endava.qmanager.domain.model.Privileges;
import com.endava.qmanager.domain.model.User;
import com.endava.qmanager.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service

public class UserService {
    @Autowired
    private  UserRepository userRepository;


    public Iterable<User> getUser(){
        return userRepository.findAll();
    }



}

