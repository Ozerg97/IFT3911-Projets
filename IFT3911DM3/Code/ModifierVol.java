public class ModifierVol implements ICommand {

	private String dateDepart;
	private String heureDepart;
	private String heureArrivee;
	private String duree;
	private ControlleurVoyage cv;

	public ModifierVol(String id_voyage) {
	}

	public void execute() {
		cv.modifierVoyage(null);
	}

	public void setReceiver(ControlleurVoyage receveurControleurVoyage)
	{
		this.cv = receveurControleurVoyage;
	}

}