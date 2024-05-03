public class ControleurCommands {

	private List list;

	private ControlleurConnexion ReceveurControleurConnexion;
	private ControlleurVoyage ReceveurControleurVoyage;
	private ControleurPaiement ReceveurControleurPaiement;
	private ControlleurCompagnie ReceveurControleurCompagnie;
	private ControlleurInfrastureTransport ReceveurControleurInfrastureTransport;
	private ObservateurCommandes oc;

	public ControleurCommands(
	 ControlleurConnexion ReceveurControleurConnexion,
	 ControlleurVoyage ReceveurControleurVoyage,
	 ControleurPaiement ReceveurControleurPaiement,
	 ControlleurCompagnie ReceveurControleurCompagnie,
	 ControlleurInfrastureTransport ReceveurControleurInfrastureTransport,
	 ObservateurCommandes oc)
	 {
		this.ReceveurControleurConnexion = ReceveurControleurConnexion;
		this.ReceveurControleurVoyage = ReceveurControleurVoyage;
		this.ReceveurControleurPaiement = ReceveurControleurPaiement;
		this.ReceveurControleurCompagnie = ReceveurControleurCompagnie;
		this.ReceveurControleurInfrastureTransport = ReceveurControleurInfrastureTransport;
		this.oc = oc;
	}

	public void setCommandsClient(ObservateurCommandes oc) {
		list = new CommandsClient(ReceveurControleurConnexion,
		ReceveurControleurVoyage,
		ReceveurControleurPaiement,
		ReceveurControleurCompagnie,
		ReceveurControleurInfrastureTransport, oc, this);
	}
	
	public void setCommandsAdmin(ObservateurCommandes oc) {
		list = new CommandsAdmin(ReceveurControleurConnexion,
		ReceveurControleurVoyage,
		ReceveurControleurPaiement,
		ReceveurControleurCompagnie,
		ReceveurControleurInfrastureTransport, oc, this);
	}

	public void setNoCommands() {
		list = new List(oc, this);
	}

	public List getList() {
		return list;
	}


}