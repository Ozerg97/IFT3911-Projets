public class SiegeLibre extends SiegeEtat {

	/**
	 * 
	 * @param siege
	 */
	public SiegeLibre(Siege siege) {
		super(siege);
	}
	public void pay(InformationClient informationClient, Paiement paiement, Double montant) {
		throw new UnsupportedOperationException();
	}
	public void cancel(Reservation reservation, String reservationNumber, Voyage voyage) {
		throw new UnsupportedOperationException();
	}

	public void reserve(Reservation reservation, Voyage voyage) {
		

		reservation.reserverSiegeCabine(voyage); //reservation du siege
		reservation.setReservationNumber(); // Générer le reservation number au client
		siege.setState(new SiegeReservé(siege)); // Changer l'état du siege pour SiegeReservé
	}
}