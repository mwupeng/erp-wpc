package com.erpSys.main.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

/**
 * * security 自定义登录
 * 
 * @author wpc
 *
 */
@Configuration
@EnableWebSecurity
public class BrowerSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userService;

	/**
	 * 登录跳转
	 */
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/assets/**").permitAll().antMatchers("/login").permitAll()
				.anyRequest().authenticated().and().formLogin()
				// 指定登录页的路径
				.loginPage("/login")
				// 指定自定义form表单请求的路径
				.loginProcessingUrl("/index").failureUrl("/login").defaultSuccessUrl("/index")
				// 必须允许所有用户访问我们的登录页（例如未验证的用户，否则验证流程就会进入死循环）
				// 这个formLogin().permitAll()方法允许所有用户基于表单登录访问/login这个page。
				.permitAll();

		// 默认都会产生一个hiden标签 里面有安全相关的验证 防止请求伪造 这边我们暂时不需要 可禁用掉
		http.csrf().disable();
	}

	/**
	 * 处理前端文件，拦截忽略
	 */
	@Override
	public void configure(WebSecurity web) throws Exception {
		// 解决静态资源被SpringSecurity拦截的问题
		web.ignoring().antMatchers("/assets/**", "/WEB-INF/**", "/**/*.jsp", "/WEB-INF/jsp/**/*.jsp", "/assets/css/**",
				"/webapp/**");
	}

	/**
	 * 设置内存中的用户
	 */
	@Autowired
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userService);
	}

	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations("/");
	}
}
