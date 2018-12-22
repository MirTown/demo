package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.Set;

public class Comment {
    private Long id;
    private User user;
    private String message;
    private LocalDateTime date;
    private Set<User> likes;
    private Set<User> dislikes;//
}
