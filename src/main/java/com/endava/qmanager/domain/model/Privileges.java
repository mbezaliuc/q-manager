package com.endava.qmanager.domain.model;

import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="privileges")

public class Privileges {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false, unique = true)

    private String name;

    @ManyToMany(mappedBy = "privileges")
    private List<User> users;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }




}
