abstract class AutHandler {

	protected UserRole userRole;
    protected AutHandler next;

    public abstract void handle(LoginRequest request);

    public void setNextAuthHandler(AutHandler next) {
        this.next = next;
    }
    
    protected void authMessage() {
        System.out.println("Authentification réussie pour le rôle de: " + userRole);
    }
    
    protected void write() {
       
        System.out.println("Écriture...");
    }
}