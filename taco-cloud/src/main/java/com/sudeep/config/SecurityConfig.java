package com.sudeep.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

@Configuration
@EnableWebSecurity
//@Profile("!nosecurity")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private UserDetailsService userDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
//		super.configure(auth);
//		auth.inMemoryAuthentication().withUser("sudeep").password("admin").authorities("ROLE_USER").and()
//				.withUser("admin").password("admin").authorities("ROLE_ADMIN");
//JDBC Authentication
//		
//		The call to authorizeRequests() returns an object (ExpressionInterceptUrlRegistry)
//		on which you can specify URL paths and patterns and the security requirements
//		for those paths.
		
		System.out.println(dataSource);
//		auth.jdbcAuthentication().dataSource(dataSource)
//				.usersByUsernameQuery("select username, password, enabled from Users " + "where username=?")
//				.authoritiesByUsernameQuery("select username, authority from UserAuthorities " + "where username=?")
//				.passwordEncoder(new BCryptPasswordEncoder());
//	
		auth.userDetailsService(userDetailsService).passwordEncoder(encoder());

//		auth.ldapAuthentication()
//		.userSearchBase("ou=people")
//		.userSearchFilter("(uid={0})")
//		.groupSearchBase("ou=groups")
//		.groupSearchFilter("member={0}")
//		.passwordCompare()
//		.passwordEncoder(new BCryptPasswordEncoder())
//		.passwordAttribute("passcode")
//		.contextSource()
//		.root("dc=tacocloud,dc=com");
	}

	@Bean
	public PasswordEncoder encoder() {
		// TODO Auto-generated method stub
		return new StandardPasswordEncoder("53cr3");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		
//		http
//		.authorizeRequests()
//		.antMatchers("/design", "/orders")
//		.access("hasRole('ROLE_USER') && " +
//		"T(java.util.Calendar).getInstance().get("+
//		"T(java.util.Calendar).DAY_OF_WEEK) == " +
//		"T(java.util.Calendar).TUESDAY")
//		.antMatchers(“/”, "/**").access("permitAll")
//		;
//		
//		.and()
//		.csrf()
//		.disable()
		
		
		// TODO Auto-generated method stub
		http.authorizeRequests()
		.antMatchers("/", "/**")
		.permitAll()
//		.antMatchers("/design", "/orders")
//		 .access("hasRole('USER')")
//		.hasRole("USER")
		
		
//		.and()
//			.formLogin()
//				.loginPage("/login")
////		.loginProcessingUrl("/authenticate")
//					.defaultSuccessUrl("/design", true)
		
	      // tag::enableLogout[]

//		.and()
//			.logout()
//				.logoutSuccessUrl("/")
		  // Make H2-Console non-secured; for debug purposes
	      // tag::csrfIgnore[]
//	      .and()
//	        .csrf()
//	          .ignoringAntMatchers("/h2-console/**")
	      // end::csrfIgnore[]

	      // Allow pages to be loaded in frames from the same origin; needed for H2-Console
	      // tag::frameOptionsSameOrigin[]
;
		
// can custommize username and password field name in login.html
//		.usernameParameter("user")
//		.passwordParameter("pwd)

	}
	

//	@SuppressWarnings("deprecation")
//	@Bean
//	public static NoOpPasswordEncoder passwordEncoder() {
//		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
//	}
}
