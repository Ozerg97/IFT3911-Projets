public class CreerItineraire implements ICommand {

	private String dateDepart;
	private String heureDepart;
	private String heureArrivee;
	private String duree;

	private FabriqueNavigation fn;

	public void execute() {
		fn.createVoyage();
	}

	public void setReceiver(FabriqueNavigation fn)
	{
		this.fn = fn;
	}
}