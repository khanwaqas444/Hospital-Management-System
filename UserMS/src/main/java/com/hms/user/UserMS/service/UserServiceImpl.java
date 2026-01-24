package com.hms.user.UserMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.user.UserMS.dto.UserDTO;
import com.hms.user.UserMS.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {

@Autowired
private UserRepository userRepository;

  @Override
  public void registerUser(UserDTO userDTO) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'registerUser'");
  }

  @Override
  public UserDTO loginuser(UserDTO userDTO) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'loginuser'");
  }

  @Override
  public UserDTO getUserById(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getUserById'");
  }

  @Override
  public Void updateUser(UserDTO userDTO) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
  }

}
