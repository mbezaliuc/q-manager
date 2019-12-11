package com.endava.qmanager.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import static lombok.AccessLevel.PRIVATE;

@Data
@NoArgsConstructor(access = PRIVATE, force = true)
@AllArgsConstructor
@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    @Enumerated(value = EnumType.STRING)
    private Role role;



    @ManyToMany(cascade=CascadeType.MERGE)
    @JoinTable(
            name="user_privileges",
            joinColumns={@JoinColumn(name="USER_ID", referencedColumnName="ID")},
            inverseJoinColumns={@JoinColumn(name="PRIVILEGE_ID", referencedColumnName="ID")})
    private List<Privileges> privileges;



public User(String username, String password) {
        this(username, password, Role.ROLE_USER);
    }

    public User(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;

    }

}
