package com.hms.user.UserMS.entity;

import com.hms.user.UserMS.dto.UserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  @Column(unique = true)
  private String email;
  private String password;
  private String role;

  public UserDTO toDTO() {
    return new UserDTO(this.id, this.name, this.email, this.password, this.role);
  }
}
