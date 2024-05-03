public class OverwriteExistItem implements ICommand {

	private BaseDeDonneesAcc bd;
	private Voyage voyage;

	OverwriteExistItem(Voyage voyage) {
		this.voyage = voyage;
	}

	public void execute() {
		bd.pushVoyage(voyage);
	}

	public void setReceiver(BaseDeDonneesAcc bd) {
		this.bd = bd;
	}
}