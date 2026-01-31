package com.hms.user.UserMS.service;

import com.hms.user.UserMS.dto.UserDTO;
import com.hms.user.UserMS.exception.HmsException;

public interface UserService {
  public void registerUser(UserDTO userDTO) throws HmsException;
  public UserDTO loginuser(UserDTO userDTO);
  public UserDTO getUserById(Long id);
  public Void updateUser(UserDTO userDTO);
}
