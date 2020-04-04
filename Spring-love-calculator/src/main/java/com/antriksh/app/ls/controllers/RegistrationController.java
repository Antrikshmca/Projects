
package com.antriksh.app.ls.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.antriksh.app.ls.api.UserRegistrationDTO;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO dto) {

		dto.setName("shivam");
		dto.setUserName("shiv123");

		return "user-registration-page";
	}

	@RequestMapping("/registreation-sucess")
	public String processUserReg(@ModelAttribute("userReg") UserRegistrationDTO dto) {
		return "registration-success";
	}
}
