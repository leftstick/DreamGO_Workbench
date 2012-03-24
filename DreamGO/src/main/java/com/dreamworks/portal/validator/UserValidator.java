package com.dreamworks.portal.validator;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.dreamworks.portal.bean.User;

@Component(value = "uservalid")
public class UserValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return clazz == User.class;
	}

	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName",
				"username.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPassword",
				"userpassword.empty");
		User user = (User) target;
		String name = StringUtils.trimWhitespace(user.getUserName());
		String pwd = StringUtils.trimWhitespace(user.getUserPassword());
		if (name.length() > 15)
			errors.rejectValue("userName", "username.length");
		if (pwd.length() > 20)
			errors.rejectValue("userPassword", "userpassword.length");

	}

}
