package com.furniture.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.furniture.model.*;

public class UserDaoImp implements UserDao {

	@Autowired
	DataSource datasource;
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int register(UserModel user) {
		String sql = "Insert into user values(?,?,?,?)";
		
		return jdbcTemplate.update(sql, new Object[] {user.getFirst_name(), user.getLast_name(), 
				user.getUsername(), user.getPassword()});
		}

	
	public UserModel validateUser(LoginModel login) {
		String sql = "select * from username where username='" + login.getUsername() + "' and password='" + login.getPassword() + "'";
		
		List<UserModel> users = jdbcTemplate.query(sql, new UserMapper());
		
		return users.size() > 0 ? users.get(0) : null;
		
	}
	
	class UserMapper implements RowMapper<UserModel> {
		public UserModel mapRow(ResultSet rs, int arg1) throws SQLException {
			UserModel user = new UserModel();
			
			user.setFirst_name(rs.getString("first_name"));
			user.setLast_name(rs.getString("last_name"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			
			return user;
			
		}
	}
	
	
	
}
