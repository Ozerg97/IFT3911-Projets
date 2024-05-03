
public class SiegeReservé extends SiegeEtat {


	/**
	 * 
	 * @param siege
	 */

	public SiegeReservé(Siege siege) {
		super(siege);
	}

	public void pay(InformationClient informationClient, Paiement paiement, Double montant) { 

		paiement.payerReservation(informationClient, montant); // payer la reservation 
		siege.setState(new SiegeOccupé(siege)); // Changer state vers SiegeOccupé
	}
	public void cancel(Reservation reservation, String reservationNumber, Voyage voyage) {
		reservation.annulerReservation(reservationNumber); // annuler reservation
		siege.setState(new SiegeLibre(siege)); // changer le state vers SiegeLibre
	}

	public void reserve(Reservation reservation, Voyage voyage) {
		
		throw new UnsupportedOperationException();
	}

}