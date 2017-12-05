package com.wanghuan.oauth2;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;

@Configuration
public class MyAuthorizationServerConfigurerAdapter extends AuthorizationServerConfigurerAdapter {


	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory().withClient("client").secret("secret")
				.authorizedGrantTypes("password", "authorization_code", "refresh_token").scopes("app");
	}

}
