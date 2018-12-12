package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dao.UserDAO;
import model.User;

@RestController
@RequestMapping("main")
public class MainController {
	@Autowired
	UserDAO dao;
	
	@GetMapping("get")
	public String getDetails() {
		User user=dao.findByEmail("email");
		System.out.println(user.toString());
		return "email";
	}
}
