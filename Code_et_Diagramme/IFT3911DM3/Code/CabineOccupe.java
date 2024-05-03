public class CabineOccupe extends EtatCabine {

	/**
	 * 
	 * @param cabineNaval
	 */
	public CabineOccupe(CabineNaval cabineNaval) {
		super(cabineNaval);
	}
	public void pay(InformationClient informationClient, Paiement paiement, Double montant) {
		
		throw new UnsupportedOperationException();
	}
	public void cancel(Reservation reservation, String reservationNumber, Voyage voyage) {
		
		voyage.annulerVoyage(reservationNumber);  // annuler voyage
		cabineNaval.setState(new CabineLibre(cabineNaval)); // change de state vers CabineLibre
	}

	public void reserve(Reservation reservation, Voyage voyage) {
		throw new UnsupportedOperationException();

}
}