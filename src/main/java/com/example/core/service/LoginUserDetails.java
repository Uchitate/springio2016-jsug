package com.example.core.service;

import com.example.core.entity.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.authority.AuthorityUtils;

/**
 * Spring Securityで使用する認証ユーザ情報を保持するクラス
 */
@Getter
@Setter
public class LoginUserDetails extends org.springframework.security.core.userdetails.User {

	private final User user;

	public LoginUserDetails(User user) {

		// ROLE_USERというロールのみ持つ権限を作成する
		super(user.getName(), user.getPassword(), AuthorityUtils.createAuthorityList("ROLE_USER"));
		this.user = user;
	}
}
