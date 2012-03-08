package com.dreamworks.portal.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dreamworks.portal.bean.User;

@Controller
public class LoginController {

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(@ModelAttribute("user") @Valid User user,
			BindingResult bindingResult, BindingResult result) {
		if (result.hasErrors()) {
			return "account/createForm";
		}
		return "redirect:login";
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String tologin(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}
}
