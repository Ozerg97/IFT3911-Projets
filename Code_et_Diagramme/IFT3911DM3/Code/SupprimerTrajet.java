public class SupprimerTrajet implements ICommand {

	private String dateDepart;
	private String heureDepart;
	private String heureArrivee;
	private String duree;

	private ControlleurVoyage cv;

	public SupprimerTrajet(String id_voyage) {
	}

	public void execute() {
		cv.supprimerVoyage(dateDepart, heureDepart, heureArrivee, duree);
	}
	public void setReceiver(ControlleurVoyage cv)
	{
		this.cv = cv;
	}

}