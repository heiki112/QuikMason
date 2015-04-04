package com.quikmason.user;

/**
 * Form for displaying/editing user data
 */
public class UserDetailsForm {

  private String currentPassword;
  private String newPassword;
  private String newPassword2;
  private User user;

  public UserDetailsForm() {

  }

  public UserDetailsForm(User user) {
    this.user = user;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public String getCurrentPassword() {
    return currentPassword;
  }

  public void setCurrentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
  }

  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  public String getNewPassword2() {
    return newPassword2;
  }

  public void setNewPassword2(String newPassword2) {
    this.newPassword2 = newPassword2;
  }

}
