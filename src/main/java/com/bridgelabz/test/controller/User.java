package com.bridgelabz.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.test.dto.LoginDTO;
import com.bridgelabz.test.dto.RegisterDTO;
import com.bridgelabz.test.response.response;
import com.bridgelabz.test.services.Operations;

/**
 * @author Amar A.Gunjal
 * @since-26/11/2019
 * 
 *
 */
@RestController
public class User {

	//we make interface operations as autowired because of that we can use access that methods in the class. 
	@Autowired
	private Operations serviceimpl;
	
	//PostMapping--annotated methods handle the HTTP POST requests matched with given URL expression. 
	//it acts as @RequestMapping(method=RequestMethod.post)
	@PostMapping("/register")
	public String register_user(@RequestBody RegisterDTO register_dto) {
		serviceimpl.register_user(register_dto);
		return "Register Successfully";

	}

	/**
	 * @param loginDTO
	 * @return-- the message login successful or login unsuccessful.
	 */
	@PutMapping("/login")
	public response user_login(@RequestBody LoginDTO loginDTO) {
		
		boolean islogin = serviceimpl.userLogin(loginDTO);
		if (islogin) {
			return new response(200, "user login", "user login successfully");
		}
		
		
		return new response(400, "user login", "user login not successfully");
	}

}
