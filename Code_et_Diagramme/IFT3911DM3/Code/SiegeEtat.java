public abstract class SiegeEtat {

	protected Siege siege;

	/**
	 * 
	 * @param siege
	 */
	public SiegeEtat(Siege siege) {
		this.siege = siege;
	}
	public abstract void pay(InformationClient informationClient, Paiement paiement, Double montant);
	public abstract void cancel(Reservation reservation, String reservationNumber, Voyage voyage);
	public abstract void reserve(Reservation reservation, Voyage voyage);

}