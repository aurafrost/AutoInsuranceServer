package com.auto_insurance.controller;

import com.auto_insurance.dao.UserDao;
import com.auto_insurance.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    UserDao userDao;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> getAllUser() {
        List<User> list = userDao.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<User> postUser(@RequestBody User user) {
        User u = userDao.save(user);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    @RequestMapping(path = "/{email}", method = RequestMethod.GET)
    public ResponseEntity<User> getUserByEmail(@PathVariable String email){
        User user = userDao.findByEmail(email);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(path = "/{userId}", method = RequestMethod.GET)
    public ResponseEntity<User> getUserByUserId(@PathVariable int userId) {
        User user = userDao.findByUserId(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(path = "/{email}", method = RequestMethod.DELETE)
    public ResponseEntity<User> deleteUserByEmail(@PathVariable String email){
        User user = userDao.deleteByEmail(email);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(path = "/{userId}", method = RequestMethod.DELETE)
    public ResponseEntity<User> deleteUserById(@PathVariable int userId){
        User user = userDao.deleteByUserId(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(path = "/{email}", method = RequestMethod.PUT)
    public ResponseEntity<User> updateUserByEmail(@PathVariable String email, @RequestBody User user){
        //TODO: Check if hibernate save overwrites the existing data
        User u = userDao.save(user);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    @RequestMapping(path = "/{userId}", method = RequestMethod.PUT)
    public ResponseEntity<User> updateUserByEmail(@PathVariable int userId, @RequestBody User user){
        //TODO: Check if hibernate save overwrites the existing data
        User u = userDao.save(user);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }
}
