package com.hms.user.UserMS.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hms.user.UserMS.entity.User;

@Repository
public interface  UserRepository extends CrudRepository<User, Long> {

}
