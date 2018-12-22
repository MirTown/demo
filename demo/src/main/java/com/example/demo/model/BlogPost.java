package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
//
public class BlogPost {
    private Long id;
    private String title;
    private String post;
    private User author;
    private LocalDateTime date;
    private Set<Tag> tags;
    private List<Comment> comments;
    private Set<User> likes;
    private Set<User> dislikes;

}
