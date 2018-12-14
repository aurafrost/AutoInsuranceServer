package com.auto_insurance.dao;

import com.auto_insurance.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {
    User findByEmail(String email);

    User findByUserId(int userId);

    List<User> findAll();

    User deleteByEmail(String email);

    User deleteByUserId(int userId);
}
