package com.bridgelabz.test.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.test.controller.User;
import com.bridgelabz.test.model.UserRegistration;

@Repository
public interface UserRepo extends JpaRepository<UserRegistration, Long>{

  public Optional<UserRegistration> findByEmail(String email);

  public String findBypassword(String password);
	
}