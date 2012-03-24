package com.dreamworks.portal.controller.loginlogic;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dreamworks.portal.bean.User;
import com.dreamworks.portal.daos.UserDao;

@Controller
@RequestMapping(value = "/loginlogic")
public class LoginLogic {
	@Resource(name = "userdao")
	private UserDao userdao;

	@Resource(name = "uservalid")
	private Validator uservalid;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(User user, BindingResult result, Model model,
			HttpServletRequest request) {
		uservalid.validate(user, result);
		if (result.hasErrors()) {
			model.addAttribute("user", user);
			return "login";
		} else {
			request.setAttribute("msg", "");
			return "common/success";
		}
	}
}
