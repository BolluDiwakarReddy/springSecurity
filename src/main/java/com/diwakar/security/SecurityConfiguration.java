package com.diwakar.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder authenticationMgrBuilder) throws Exception {
		authenticationMgrBuilder.inMemoryAuthentication()
		.withUser("devUser").password("{noop}dev").authorities("ROLE_USER")
				.and()
				.withUser("adminUser").password("{noop}admin").authorities("ROLE_USER,ROLE_ADMIN");
	}
	// Autherization
	protected void Configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/addStudent*").hasRole("USER")
		.antMatchers("/update*").hasRole("ADMIN")
		.antMatchers("/fetchAll").permitAll().and().httpBasic();
	}

}
