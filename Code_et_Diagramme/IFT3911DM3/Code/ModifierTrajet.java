public class ModifierTrajet implements ICommand {

	private String dateDepart;
	private String heureDepart;
	private String heureArrivee;
	private String duree;

	private ControlleurVoyage cv;

	public ModifierTrajet(String id_voyage) {
	}

	public void execute() {
		cv.modifierVoyage(null);
	}

	public void setReceiver(ControlleurVoyage cv)
	{
		this.cv = cv;
	}
}