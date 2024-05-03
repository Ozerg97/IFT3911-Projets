public class CreerTrajet implements ICommand {

	private String dateDepart;
	private String heureDepart;
	private String heureArrivee;
	private String duree;

	private FabriqueCheminFer fc;

	public void execute() {
		fc.createVoyage();
	}

	public void setReceiver(FabriqueCheminFer fc)
	{
		this.fc = fc;
	}

}