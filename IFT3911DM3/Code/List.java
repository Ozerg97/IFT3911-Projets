public class List {

	protected Invoker invoker;
	protected ObservateurCommandes oc;
	protected ControleurCommands cc;
	protected BaseDeDonneesAcc dba;


	List(ObservateurCommandes oc, ControleurCommands cc) {
        this.oc = oc;
        this.cc = cc;
		dba = BaseDeDonneesAcc.getInst();
        invoker = new Invoker();
        login();
    }

	public void execute() {
        invoker.execute();
    }

	public void login() {
		// TODO - implement List.login
		throw new UnsupportedOperationException();
	}

	public void logout() {
		// TODO - implement List.logout
		throw new UnsupportedOperationException();
	}

}