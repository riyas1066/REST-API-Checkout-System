package com.checkoutsystem.spring.testing;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

import com.checkoutsystem.spring.controller.HomeController;
import com.checkoutsystem.spring.model.User;

class HomeControllerTest {

	@Test
	void testHome() {
		Model model = null;
		HomeController test = new HomeController(); 
		String output = test.home(model);
		assertEquals("home", output);
	}

	@Test
	void testUser() {
		Model model = new ExtendedModelMap();
		User user = new User();
		user.setQuanOne(10);
		user.setQuanTwo(20);
		user.setQuanThree(30);
		HomeController test = new HomeController(); 
		String output = test.user(user, model);
		assertEquals("user", output);
	}

}

