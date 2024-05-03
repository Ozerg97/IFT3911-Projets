public class ClientAutHandler extends AutHandler {

	public ClientAutHandler() {
        this.userRole = UserRole.client;
    }

    public void handle(LoginRequest request) {
        if (request.role == UserRole.client) {
            authMessage();
            write();
        } else if (next != null) {
            next.handle(request);
        }
    }

}