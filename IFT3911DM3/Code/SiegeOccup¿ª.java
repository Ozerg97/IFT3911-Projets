public class SiegeOccupé extends SiegeEtat {


	/**
	 * 
	 * @param siege
	 */

	public SiegeOccupé(Siege siege) {
		// TODO - implement SiegeOccup�.SiegeOccup�
		super(siege);
	}

	public void pay(InformationClient informationClient, Paiement paiement, Double montant) {
		
		throw new UnsupportedOperationException();
	}
	public void cancel(Reservation reservation, String reservationNumber, Voyage voyage) {
		
		voyage.annulerVoyage(reservationNumber);  // annuler voyage
		siege.setState(new SiegeLibre(siege)); // change de state vers SiegeLibre
	}

	public void reserve(Reservation reservation, Voyage voyage) {
		throw new UnsupportedOperationException();
	}
}