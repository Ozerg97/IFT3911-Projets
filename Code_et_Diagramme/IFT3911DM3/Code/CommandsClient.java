public class CommandsClient extends List {

	private ControlleurConnexion ReceveurControleurConnexion;
	private ControlleurVoyage ReceveurControleurVoyage;
	private ControleurPaiement ReceveurControleurPaiement;
	private ControlleurCompagnie ReceveurControleurCompagnie;
	private ControlleurInfrastureTransport ReceveurControleurInfrastureTransport;

	CommandsClient(ControlleurConnexion ReceveurControleurConnexion,
	ControlleurVoyage ReceveurControleurVoyage,
	ControleurPaiement ReceveurControleurPaiement,
	ControlleurCompagnie ReceveurControleurCompagnie,
	ControlleurInfrastureTransport ReceveurControleurInfrastureTransport,
	ObservateurCommandes oc, ControleurCommands cc) {

		super(oc,cc);

		this.ReceveurControleurConnexion = ReceveurControleurConnexion;
		this.ReceveurControleurVoyage = ReceveurControleurVoyage;
		this.ReceveurControleurPaiement = ReceveurControleurPaiement;
		this.ReceveurControleurCompagnie = ReceveurControleurCompagnie;
		this.ReceveurControleurInfrastureTransport = ReceveurControleurInfrastureTransport;

	}

	public void rechercheVoyage() {
		RechercheVoyage rechercheVoyage = new RechercheVoyage();
		rechercheVoyage.setReceiver();
		invoker.setCommand(null);;
	}

	public void rechercheCompagnieAerienne() {
		RechercherCompagnieAerienne rechercheCompagnieAerienne = new RechercherCompagnieAerienne();
		rechercheCompagnieAerienne.setReceiver();
		invoker.setCommand(null);;
	}

	public void rechercheCompagnieCroisiere() {
		RechercherCompagnieCroisiere rechercheCompagnieCroisiere = new RechercherCompagnieCroisiere();
		rechercheCompagnieCroisiere.setReceiver();
		invoker.setCommand(rechercheCompagnieCroisiere);;
	}

	public void rechercheLigneTrain() {
		RechercherLignetrain rechercheLigneTrain = new RechercherLignetrain();
		rechercheLigneTrain.setReceiver();
		invoker.setCommand(rechercheLigneTrain);
	}

	public void rechercheReservation() {
		RechercherReservation rechercheReservation = new RechercherReservation(null, null, null, null);
		rechercheReservation.setReceiver(null);
		invoker.setCommand(rechercheReservation);
	}

	public void payerReservation() {
		PayerReservation payerReservation = new PayerReservation();
		payerReservation.setReceiver(null);
		invoker.setCommand(payerReservation);
	}

}