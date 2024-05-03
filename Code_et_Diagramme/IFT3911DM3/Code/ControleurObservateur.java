public class ControleurObservateur {

	private String db;
	private EtatConnexion etatConnexion;
	private IUserConnect userConnect;
	private ObservateurCommandes observateurCommands;
	private ObservateurVoyages observateurVoyage;
	private ObservateurReservations observateurReservation;
	private ControlleurVoyage cv;
	private ControleurCommands cc;
	private ControleurReservation cr;

	public ControleurObservateur(ControleurCommands cc, ControlleurVoyage cv, ControleurReservation cr) {
		this.cc = cc;
		this.cv = cv;
		this.cr = cr;

		ResultatRechercheVoyage resultatRecherche = new ResultatRechercheVoyage();

		observateurCommands = new ObservateurCommandes();
		observateurVoyage = new ObservateurVoyages(cv);
		observateurReservation = new ObservateurReservations(cr);

		
	}

	public void ControleurConnection() {
		
	}

	public void registerObservers() {
		
	}

	public void setUserConnect() {
		
	}

}