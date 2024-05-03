public class CommandsAdmin extends List {

	private ControlleurConnexion ReceveurControleurConnexion;
	private ControlleurVoyage ReceveurControleurVoyage;
	private ControleurPaiement ReceveurControleurPaiement;
	private ControlleurCompagnie ReceveurControleurCompagnie;
	private ControlleurInfrastureTransport ReceveurControleurInfrastureTransport;

	CommandsAdmin(ControlleurConnexion ReceveurControleurConnexion,
	ControlleurVoyage ReceveurControleurVoyage,
	ControleurPaiement ReceveurControleurPaiement,
	ControlleurCompagnie ReceveurControleurCompagnie,
	ControlleurInfrastureTransport ReceveurControleurInfrastureTransport,
	ObservateurCommandes oc, ControleurCommands cc) {

	super(oc, cc);

	this.ReceveurControleurConnexion = ReceveurControleurConnexion;
	this.ReceveurControleurVoyage = ReceveurControleurVoyage;
	this.ReceveurControleurPaiement = ReceveurControleurPaiement;
	this.ReceveurControleurCompagnie = ReceveurControleurCompagnie;
	this.ReceveurControleurInfrastureTransport = ReceveurControleurInfrastureTransport;
	}

	public void creerVol() {
		CreerVol creationVol = new CreerVol();
		creationVol.setReceiver(FabriqueAviation.getFabriqueAviation());
		invoker.setCommand(creationVol);
	}

	public void modifierVol() {
		ModifierVol ModificationVol = new ModifierVol(null);
		ModificationVol.setReceiver(ReceveurControleurVoyage);
		invoker.setCommand(ModificationVol);
	}

	public void supprimerVol() {
		SupprimerVol SupressionVol = new SupprimerVol(null);
		SupressionVol.setReceiver(ReceveurControleurVoyage);
		invoker.setCommand(SupressionVol);
	}

	public void creerTrajet() {
		CreerTrajet creationTrajet = new CreerTrajet();
		creationTrajet.setReceiver(FabriqueCheminFer.getFabriqueCheminFer());
		invoker.setCommand(creationTrajet);
	}

	public void modifierTrajet() {
		ModifierTrajet modificationTrajet = new ModifierTrajet(null);
		modificationTrajet.setReceiver(ReceveurControleurVoyage);
		invoker.setCommand(modificationTrajet);
	}

	public void supprimerTrajet() {
		SupprimerTrajet supressionTrajet = new SupprimerTrajet(null);
		supressionTrajet.setReceiver(ReceveurControleurVoyage);
		invoker.setCommand(supressionTrajet);
	}

	public void creerItineraire() {
		CreerItineraire creationItineraire = new CreerItineraire();
		creationItineraire.setReceiver(FabriqueNavigation.getFabriqueNavigation());
		invoker.setCommand(creationItineraire);
	}

	public void modifierItineraire() {
		ModifierItineraire modificationItineraire = new ModifierItineraire(null);
		modificationItineraire.setReceiver(ReceveurControleurVoyage);
		invoker.setCommand(modificationItineraire);
	}

	public void supprimerItineraire() {
		SupprimerItineraire supressionItineraire = new SupprimerItineraire(null);
		supressionItineraire.setReceiver(ReceveurControleurVoyage);
		invoker.setCommand(supressionItineraire);
	}

	public void pushNewItem() {
		PushNewItem pushNewItem = new PushNewItem(null);
		pushNewItem.setReceiver(dba);
		invoker.setCommand(pushNewItem);
	}

	public void overwriteExistItem() {
		OverwriteExistItem overwriteExistItem = new OverwriteExistItem(null);
		overwriteExistItem.setReceiver(dba);
		invoker.setCommand(overwriteExistItem);
	}

}