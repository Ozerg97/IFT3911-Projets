public class CreerVol implements ICommand {

	private String dateDepart;
	private String heureDepart;
	private String heureArrivee;
	private String duree;

	private FabriqueAviation fa;

	public void execute() {
		fa.createVoyage();
	}

	public void setReceiver(FabriqueAviation fa)
	{
		this.fa = fa;
	}

}