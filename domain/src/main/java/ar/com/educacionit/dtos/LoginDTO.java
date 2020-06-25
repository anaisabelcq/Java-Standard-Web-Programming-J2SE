package ar.com.educacionit.dtos;

/**
 * Modelo de la vista login.jsp 
 * @author CX PC
 *
 */
public class LoginDTO {

	private String userName;
	
	private String password;

	public LoginDTO(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public LoginDTO() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginModel [userName=" + userName + ", password=" + password + "]";
	}
	
}
