package com.bridgelabz.test.response;


/**
 * @author Amar A.Gunjal
 * @since-26/11/2019
 * @purpose--Here we declared the message that we want to print.
 *
 */
public class response {

	private String message;
	private int status;
	private Object data;

	public response( int status,String message, Object data) {
		super();
		this.message = message;
		this.status = status;
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public int getStatus() {
		return status;
	}

	public Object getData() {
		return data;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
