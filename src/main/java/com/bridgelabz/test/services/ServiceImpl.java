package com.bridgelabz.test.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.test.dto.LoginDTO;
import com.bridgelabz.test.dto.RegisterDTO;
import com.bridgelabz.test.model.UserRegistration;
import com.bridgelabz.test.repo.UserRepo;


@Service
public class ServiceImpl implements Operations{
	//usere repo is the object of the USerRepo in that interface we define the connection of JPARepositorty.
	@Autowired
	private UserRepo user_repo;
	
	
	/**
	 *purpose=Here we set the registration information which we want to put in the database.
	 */
	@Override
	public String register_user(RegisterDTO registerdto) {
		
		ModelMapper mapper = new ModelMapper();
		UserRegistration user = mapper.map(registerdto, UserRegistration.class);
		user.setFirstname(registerdto.getFirstname());
		user.setLastname(registerdto.getLastname());
		user.setUsername(registerdto.getUsername());
		user.setPassword(registerdto.getPassword());
		user.setEmail(registerdto.getEmail());
		user.setMobileno(registerdto.getMobileno());
		
		user_repo.save(user);
		return "registration successfully";
		
	}

	/**
	 *purpose-Here we check that username or password is correct or not 
	 *			then the result is returned.
	 */
	@Override
	public boolean userLogin(LoginDTO loginDTO) {
				
		System.out.println(loginDTO.getEmail());
		System.out.println(loginDTO.getPassword());
		UserRegistration user=user_repo.findByEmail(loginDTO.getEmail()).orElse(null);
		String email=user.getEmail();
		String pass=user.getPassword();
	
		 if(email.equals(loginDTO.getEmail())||pass.equals(loginDTO.getPassword())) {			
			 
			 return true;
		 }
		 else
		 {
			 return false;	
		 }
			 
				
	}					
}
