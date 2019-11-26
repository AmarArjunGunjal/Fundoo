package com.bridgelabz.test.services;

import com.bridgelabz.test.dto.LoginDTO;
import com.bridgelabz.test.dto.RegisterDTO;


/**
 * @author Amar.A.Gunjal
 * @since-26/11/2019
 * @purpose--its a interface here we declared methode that we want to perform.
 *
 */
public interface Operations {
	
	public String register_user(RegisterDTO registerdto);
	
	
	public  boolean  userLogin(LoginDTO loginDTO);
	

}
