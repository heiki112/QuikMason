package com.quikmason.user;

/**
 * Services for adding and editing user information
 */
public interface UserService {

  /**
   * Gets user by username
   * 
   * @param username Username
   * @return User or null if none found
   */
  User loadUserByUsername(String username);

  /**
   * Updates information about given user
   * 
   * @param user User. Must not be null
   */
  void updateUser(User user);

  void save(User user);

}
