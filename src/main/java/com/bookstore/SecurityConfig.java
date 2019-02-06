package com.bookstore;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Bean
	@Override
	public UserDetailsService userDetailsServiceBean() throws Exception {
		
		List<UserDetails> users= new ArrayList<>();
		users.add(User.withDefaultPasswordEncoder().username("rayhan").password("123456").roles("USER").build());
		return new InMemoryUserDetailsManager(users);
	}
	
	

}
