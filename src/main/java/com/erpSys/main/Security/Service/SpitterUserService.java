package com.erpSys.main.Security.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 基于jdbc查询数据
 * @author wpc
 *
 */
@Service
public class SpitterUserService implements UserDetailsService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User.UserBuilder users = User.withDefaultPasswordEncoder();
		Map<String, Object> map = jdbcTemplate.queryForMap(
				"SELECT loginname,NAME,PASSWORD,organizationid,roleid FROM `user` WHERE loginname = ? ", username);
		Timestamp joinTime = null;
		if (map != null && map.size() > 0) {
			String login_name = (String) map.get("loginname");
			String NAME = (String) map.get("NAME");
			String PASSWORD = (String) map.get("PASSWORD");
			String organization_id = (String) map.get("organizationid");
			Integer role_id = (Integer) map.get("roleid");
			users.password(PASSWORD);
			users.username(login_name);
			List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
			list.add(new SimpleGrantedAuthority("ROLE_" + Integer.toString(role_id)));
			users.authorities(list);
		}
		UserDetails userDetails = users.build();
		SecurityUser securityUser = new SecurityUser(userDetails.getUsername(), userDetails.getPassword(),
				userDetails.getAuthorities());
		securityUser.setJoinTime(joinTime);
		return securityUser;
	}

}
