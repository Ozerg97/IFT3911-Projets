public class CabineReserve extends EtatCabine {

	/**
	 * 
	 * @param cabineNaval
	 */
	public CabineReserve(CabineNaval cabineNaval) {

		super(cabineNaval);
	}
	public void pay(InformationClient informationClient, Paiement paiement, Double montant) { 

		paiement.payerReservation(informationClient, montant); // payer la reservation
		cabineNaval.setState(new CabineOccupe(cabineNaval)); // Changer le state vers CabineOccupe
	}
	public void cancel(Reservation reservation, String reservationNumber, Voyage voyage) {
		reservation.annulerReservation(reservationNumber); // annuler reservation
		cabineNaval.setState(new CabineLibre(cabineNaval)); // changer le state vers CabineLibre
	}

	public void reserve(Reservation reservation, Voyage voyage) {
		
		throw new UnsupportedOperationException();

	}

}