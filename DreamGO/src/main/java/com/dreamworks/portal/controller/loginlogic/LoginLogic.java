package com.dreamworks.portal.controller.loginlogic;

import java.util.Collections;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dreamworks.portal.bean.User;
import com.dreamworks.portal.services.UserService;
import com.dreamworks.portal.validator.Validator;

@Controller
@RequestMapping(value = "/loginlogic")
public class LoginLogic {
	@Resource(name = "userservice")
	private UserService userservice;

	@Resource(name = "uservalid")
	private Validator uservalid;

	// @RequestMapping(value = "/login", method = RequestMethod.POST)
	// public String login(User user, BindingResult result, Model model,
	// HttpServletRequest request) {
	// uservalid.validate(user, result);
	// if (result.hasErrors()) {
	// model.addAttribute("user", user);
	// return "entrance/login";
	// }
	// userservice.login(user, result);
	// if (result.hasErrors()) {
	// model.addAttribute("user", user);
	// return "entrance/login";
	// }
	// request.setAttribute("msg", "登陆成功");
	// return "common/success";
	// }

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public @ResponseBody
	Map<String, ? extends Object> register(@RequestBody User user,
			HttpServletResponse response) throws Exception {
		// uservalid.validator(user);
		// if (result.hasErrors()) {
		// model.addAttribute("user", user);
		// return "entrance/register";
		// }
//		 userservice.registerUser(user);
		if(true)
			throw new Exception("hello word");
		// if (result.hasErrors()) {
		// model.addAttribute("user", user);
		// return "entrance/register";
		// }
		// request.setAttribute("msg", "注册成功");
		System.out.println(user);
		return Collections.singletonMap("id", user);

	}
}
