public abstract class EtatCabine {

	protected CabineNaval cabineNaval;

	/**
	 * 
	 * @param cabineNaval
	 */
	public EtatCabine(CabineNaval cabineNaval) {
		this.cabineNaval = cabineNaval;
	}

	
	public abstract void pay(InformationClient informationClient, Paiement paiement, Double montant);
	public abstract void cancel(Reservation reservation, String reservationNumber, Voyage voyage);
	public abstract void reserve(Reservation reservation, Voyage voyage);

}
