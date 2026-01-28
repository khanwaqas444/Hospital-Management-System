package com.hms.user.UserMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hms.user.UserMS.dto.UserDTO;
import com.hms.user.UserMS.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {

@Autowired
private UserRepository userRepository;

@Autowired
private PasswordEncoder passwordEncoder;

  @Override
  public void registerUser(UserDTO userDTO) {
  }

  @Override
  public UserDTO loginuser(UserDTO userDTO) {
  }

  @Override
  public UserDTO getUserById(Long id) {
  }

  @Override
  public Void updateUser(UserDTO userDTO) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
  }

}
