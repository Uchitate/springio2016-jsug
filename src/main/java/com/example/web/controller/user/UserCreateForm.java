package com.example.web.controller.user;

import com.example.core.entity.User;
import com.example.core.model.UserCreateRequest;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
public class UserCreateForm implements Serializable {

	@NotNull
	private String name;

	@NotNull
	private String password;

	@Email
	private String email;

	private Integer age;

	private User.Gender gender;

	public UserCreateRequest toUserCreateRequest() {
		UserCreateRequest request = new UserCreateRequest();
		request.setName(getName());
		request.setPassword(getPassword());
		request.setEmail(getEmail());
		request.setAge(getAge());
		request.setGender(getGender());
		return request;
	}
}
