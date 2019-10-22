package com.springbootjpademo.dao;

import org.springframework.data.repository.CrudRepository;

import com.springbootjpademo.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
