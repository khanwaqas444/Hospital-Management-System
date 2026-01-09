package com.hms.user.UserMS.dto;

import com.hms.user.UserMS.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
  private long id;
  private String name;
  private String email;
  private String password;
  private String role;

  public User toEntity() {
    return new User(this.id, this.name, this.email, this.password, this.role);
  }
}
