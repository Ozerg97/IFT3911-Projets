public class AdminAutHandler extends AutHandler {

	public AdminAutHandler() {
        this.userRole = UserRole.admin;
    }

	public void handle(LoginRequest request) {
        if (request.role == UserRole.admin) {
            authMessage();
            write();
        } else if (next != null) {
            next.handle(request);
        }
    }
}