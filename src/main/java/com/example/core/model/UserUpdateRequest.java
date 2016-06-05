package com.example.core.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserUpdateRequest {

	private Long id;

	private String name;

	private String email;

	private Integer age;
}
