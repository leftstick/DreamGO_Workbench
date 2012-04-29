package com.dreamworks.portal.validator.imps;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import com.dreamworks.portal.bean.User;
import com.dreamworks.portal.exception.ValidatorException;
import com.dreamworks.portal.validator.Validator;

@Component(value = "uservalid")
public class UserValidator implements Validator {

	public void validator(Object obj) throws Exception {
		if (obj == null)
			throw new ValidatorException("user.blank");
		if (!(obj instanceof User))
			throw new ValidatorException("user.notuser");
		User user = (User) obj;
		if (StringUtils.isBlank(user.getUserName()))
			throw new ValidatorException("username.empty");
		if (StringUtils.isBlank(user.getUserPassword()))
			throw new ValidatorException("userpassword.empty");
		String name = StringUtils.trim(user.getUserName());
		String pwd = StringUtils.trim(user.getUserPassword());
		if (name.length() > 15)
			throw new ValidatorException("username.length");
		if (pwd.length() > 20)
			throw new ValidatorException("userpassword.length");

	}
}
