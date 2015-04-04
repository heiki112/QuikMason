package com.quikmason.user;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserServiceJdbcImpl implements UserService {

  @Resource
  private JdbcTemplate jdbcTemplate;

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

      user.setUsername(rs.getString("username"));
      user.setPassword(rs.getString("password"));
      user.setName(rs.getString("name"));

      return user;
    }
  }

  @Override
  public void updateUser(User user) {
    String sql = "update " + User.TABLE_NAME + " set password=? where username=?";
    jdbcTemplate.update(sql, user.getPassword(), user.getUsername());
  }

}
