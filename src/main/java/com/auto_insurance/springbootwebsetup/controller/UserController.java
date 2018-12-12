package com.auto_insurance.springbootwebsetup.controller;

import com.auto_insurance.springbootwebsetup.dao.UserDao;
import com.auto_insurance.springbootwebsetup.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    UserDao userDao;

    @GetMapping("/")
    public String getUsers(String email){
        User user = userDao.findByEmail(email);
        return email;
     }
}
