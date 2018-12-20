package com.auto_insurance.controller;

import com.auto_insurance.dao.UserDao;
import com.auto_insurance.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    UserDao userDao;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> getAllUser() {
        List<User> list = (List<User>) userDao.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<User> postUser(@RequestBody User user) {
        User u = userDao.save(user);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    @RequestMapping(path = "/customers", method = RequestMethod.GET)
    public ResponseEntity<List<User>> getUserCustomers(){
        List<User> list = userDao.findAllByType("Customer");
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @RequestMapping(path = "/claim_officers", method = RequestMethod.GET)
    public ResponseEntity<List<User>> getUserClaimOfficers(){
        List<User> list = userDao.findAllByType("ClaimOfficer");
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @RequestMapping(path = "/inspect_officers", method = RequestMethod.GET)
    public ResponseEntity<List<User>> getUserInspectOfficers(){
        List<User> list = userDao.findAllByType("InspectOfficer");
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @RequestMapping(path = "/{type}/{userId}", method = RequestMethod.GET)
    public ResponseEntity<User> getUserByUserIdAndType(@PathVariable int userId, @PathVariable String type){
        User user = userDao.findByUserIdAndType(userId, type);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(path = "/email/{email}", method = RequestMethod.GET)
    public ResponseEntity<User> getUserByEmail(@PathVariable String email){
        System.out.println(email);
        User user = userDao.findByEmail(email);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(path = "/id/{userId}", method = RequestMethod.GET)
    public ResponseEntity<User> getUserByUserId(@PathVariable int userId) {
        User user = userDao.findByUserId(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(path = "/email/{email}", method = RequestMethod.DELETE)
    public ResponseEntity<User> deleteUserByEmail(@PathVariable String email){
        User user = userDao.deleteByEmail(email);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(path = "/id/{userId}", method = RequestMethod.DELETE)
    public ResponseEntity<User> deleteUserById(@PathVariable int userId){
        User user = userDao.deleteByUserId(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(path = "/email/{email}", method = RequestMethod.PUT)
    public ResponseEntity<User> updateUserByEmail(@PathVariable String email, @RequestBody User user){
        //TODO: Check if hibernate save overwrites the existing data


        User u = userDao.save(user);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    @RequestMapping(path = "/id/{userId}", method = RequestMethod.PUT)
    public ResponseEntity<User> updateUserByEmail(@PathVariable int userId, @RequestBody User user){
        User findUser = userDao.findByUserId(userId);
        findUser.setPolicyNo(user.getPolicyNo());
        findUser.setAddress(user.getAddress());
        findUser.setEmail(user.getEmail());
        findUser.setFname(user.getFname());
        findUser.setLname(user.getLname());
        findUser.setPhone(user.getPhone());
        User u = userDao.save(findUser);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    @RequestMapping(path = "/{userId}/status", method = RequestMethod.PUT)
    public ResponseEntity<User> updateUserStatus(@PathVariable int userId, @RequestBody User user) {
         User findUser = userDao.findByUserId(userId);
         findUser.setStatus(user.getStatus());
         User u = userDao.save(findUser);
         return new ResponseEntity<>(u, HttpStatus.OK);
    }
}
