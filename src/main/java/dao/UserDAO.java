package dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.User;

@Repository
public interface UserDAO extends CrudRepository<User, String>{
	User findByEmail(String email);
}
