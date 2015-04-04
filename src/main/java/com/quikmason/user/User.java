package com.quikmason.user;

/**
 * Class that represents an application user
 */
public class User {

  public static final String TABLE_NAME = "USER";

  private String username;
  private String password;
  private String name;
  private String email;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

}
