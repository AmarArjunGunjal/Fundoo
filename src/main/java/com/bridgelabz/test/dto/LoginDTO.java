package com.bridgelabz.test.dto;


/**
 * @author Amar A. Gunjal
 * @since -26/11/2019
 * @purpose--Here the login fields we required and to fetch the data
 *			to check that the login details are correct or not.
 */
public class LoginDTO {
	
		String email;
		String password;
		public String getEmail() {
			return email;
		}
		public String getPassword() {
			return password;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public void setPassword(String password) {
			this.password = password;
		}
}
