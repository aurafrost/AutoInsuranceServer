package com.auto_insurance.dao;

import com.auto_insurance.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends CrudRepository<User, String> {
    User findByEmail(String email);

    List<User> findAll();

    User deleteByEmail(String email);
}
