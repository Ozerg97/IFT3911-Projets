public class GuestAutHandler extends AutHandler {

	public GuestAutHandler() {
        this.userRole = UserRole.guest;
    }

    public void handle(LoginRequest request) {
        if (request.role == UserRole.guest) {
            authMessage();
            write();
        } else if (next != null) {
            next.handle(request);
        }
    }

}