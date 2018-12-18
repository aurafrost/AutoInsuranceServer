package com.auto_insurance.dao;

import com.auto_insurance.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {
    List<User> findAllByType(String type);

    User findByEmail(String email);

    User findByUserId(int userId);

    User deleteByEmail(String email);

    User deleteByUserId(int userId);

    User findByUserIdAndType(int userId, String type);


}
