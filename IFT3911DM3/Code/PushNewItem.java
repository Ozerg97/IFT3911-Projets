public class PushNewItem implements ICommand {

	private BaseDeDonneesAcc bd;
	private Voyage voyage;

	PushNewItem(Voyage voyage) {
		this.voyage = voyage;
	}

	public void execute() {
		bd.pushVoyage(voyage);
	}

	public void setReceiver(BaseDeDonneesAcc bd) {
		this.bd = bd;
	}
}