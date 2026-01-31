package com.hms.user.UserMS.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hms.user.UserMS.dto.UserDTO;
import com.hms.user.UserMS.entity.User;
import com.hms.user.UserMS.exception.HmsException;
import com.hms.user.UserMS.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {

@Autowired
private UserRepository userRepository;

@Autowired
private PasswordEncoder passwordEncoder;

  @Override
  public void registerUser(UserDTO userDTO) throws HmsException{
    Optional <User> opt= userRepository.findByEmail(userDTO.getEmail());
    if(opt.isPresent()) {
      throw new HmsException("USER_ALREADY_EXISTS");
    }
    userDTO.setPassword(passwordEncoder.encode(userDTO.getPassword()));
  }

  @Override
  public UserDTO loginuser(UserDTO userDTO) {
    return null;
  }

  @Override
  public UserDTO getUserById(Long id) {
    return null;
  }

  @Override
  public Void updateUser(UserDTO userDTO) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
  }

}
