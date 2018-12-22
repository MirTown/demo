package com.example.demo.model;

import java.util.Set;

public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
    private Set<User> subscriptions;
    private Set<User> followers;

}
//