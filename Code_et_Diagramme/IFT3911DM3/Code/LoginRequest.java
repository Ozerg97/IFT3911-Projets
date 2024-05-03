public class LoginRequest {

	private String username;
	private String password;
	protected UserRole role;

	public LoginRequest(String username, String password, UserRole role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }


	public void envoyer(String username, String password, String Role) {
		
	}

}