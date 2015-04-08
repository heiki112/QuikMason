package com.quikmason.user;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

import javax.annotation.Resource;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserServiceJdbcImpl implements UserService {

  @Resource
  private JdbcTemplate jdbcTemplate;
  
  private static Logger logger = Logger.getLogger(UserServiceJdbcImpl.class);

  @Override
  public User loadUserByUsername(String username) {
    try {
      return jdbcTemplate.queryForObject("SELECT * FROM user WHERE username = ?", new UserRowMapper(), username);
    } catch (IncorrectResultSizeDataAccessException e) {
      if (e.getActualSize() == 0) {
        return null;
      }

      throw e;
    }
  }

  private static class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
      User user = new User();
      
      user.setId(rs.getInt("id"));
      user.setUsername(rs.getString("username"));
      user.setPassword(rs.getString("password"));
      user.setFirstName(rs.getString("first_name"));
      user.setLastName(rs.getString("last_name"));
      user.setEmail(rs.getString("email"));

      return user;
    }
  }
  
  @Override
  public void save(User user) {
    String sql;
    List<Object> args = new ArrayList<>();
    args.add(user.getUsername());
    args.add(user.getPassword());
    args.add(user.getFirstName());
    args.add(user.getLastName());
    args.add(user.getEmail());

    if (Integer.valueOf(user.getId()) == null) {
      sql = "insert into user (username, password, first_name, last_name, email) values (?,?,?,?,?)";
    } else {
      sql = "update user set username=?, password=?, first_name=?, last_name=?, email=? where id= ?";
      args.add(user.getId());
    }
    logger.warn(user.getFirstName());
    jdbcTemplate.update(sql, args.toArray());
  }

  @Override
  public void updateUser(User user) {
    String sql = "update " + User.TABLE_NAME + " set password=? where username=?";
    jdbcTemplate.update(sql, user.getPassword(), user.getUsername());
  }

}
