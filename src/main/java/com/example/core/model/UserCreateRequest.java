package com.example.core.model;

import com.example.core.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateRequest {

	private String name;

	private String password;

	private String email;

	private Integer age;

	private User.Gender gender;
}
