package com.endava.qmanager.repository;

import com.endava.qmanager.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByUsername(String username);
}

