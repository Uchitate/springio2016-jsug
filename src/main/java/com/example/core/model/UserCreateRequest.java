package com.example.core.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateRequest {

	private String name;

	private String email;

	private Integer age;
}