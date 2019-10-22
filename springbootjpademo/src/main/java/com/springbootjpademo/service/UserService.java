package com.springbootjpademo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springbootjpademo.dao.UserRepository;
import com.springbootjpademo.model.User;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;
@Component
public class UserService {
	@Autowired UserRepository repository;
	 public void add(User user) {
	        repository.save(user);
	    }
	   /*public void delete(int id) {
	        repository.deleteById(id);
	    }*/
	    public List<User> read() {
	        return (List<User>) repository.findAll();
	    }
	   public User getUserById(int id) {
	       
	    	User result = repository.findById(id).get();
	        return result;
	    }
	 public User update(  User user,int id) {
	        User entity = repository.findById(id).get();
	        entity.setUserId(user.getUserId());
	        entity.setUserName(user.getUserName());
	        entity.setPassword(user.getPassword());
	        User result=repository.save(entity);
	        return result;
	    }
	   public void deleteuser(int id)
	   {
		   repository.deleteById(id);
	   }
		
	
}
