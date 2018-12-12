package com.auto_insurance.springbootwebsetup.dao;

import com.auto_insurance.springbootwebsetup.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, String> {
    User findByEmail(String email);

}
