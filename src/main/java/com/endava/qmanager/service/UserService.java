package com.endava.qmanager.service;

import com.endava.qmanager.domain.model.User;
import com.endava.qmanager.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;

import java.util.Arrays;

@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    private  UserRepository userRepository;

    public Iterable<User> getUser(){
        return userRepository.findAll();
    }
}
