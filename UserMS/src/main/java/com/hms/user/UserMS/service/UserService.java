package com.hms.user.UserMS.service;

import com.hms.user.UserMS.dto.UserDTO;

public interface UserService {
  public void registerUser(UserDTO userDTO);
  public UserDTO loginuser(UserDTO userDTO);
  public UserDTO getUserById(Long id);
  public Void updateUser(UserDTO userDTO);
}
