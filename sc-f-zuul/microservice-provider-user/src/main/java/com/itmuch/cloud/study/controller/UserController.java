package com.itmuch.cloud.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.itmuch.cloud.study.entity.User;

@RestController
public class UserController {


  @GetMapping("/{id}")
  public User findById(@PathVariable Long id) {
    User findOne = new User(id,"admin","tom",20);
    return findOne;
  }
}
