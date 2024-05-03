public class ModifierItineraire implements ICommand {

	private String dateDepart;
	private String heureDepart;
	private String heureArrivee;
	private String duree;
	private ControlleurVoyage cv;

	public ModifierItineraire(String id_voyage) {
	}

	public void execute() {
		cv.modifierVoyage(null);
	}

	public void setReceiver(ControlleurVoyage cv)
	{
		this.cv = cv;
	}
}