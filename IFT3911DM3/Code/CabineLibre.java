public class CabineLibre extends EtatCabine {

	/**
	 * 
	 * @param cabineNaval
	 */
	public CabineLibre(CabineNaval cabineNaval) {
		super(cabineNaval);
	}
	public void pay(InformationClient informationClient, Paiement paiement, Double montant) {
		throw new UnsupportedOperationException();
	}
	public void cancel(Reservation reservation, String reservationNumber, Voyage voyage) {
		throw new UnsupportedOperationException();
	}

	public void reserve(Reservation reservation, Voyage voyage) {
		

		reservation.reserverSiegeCabine(voyage); //reservation de la cabine
		reservation.setReservationNumber(); // Générer le reservation number au client
		cabineNaval.setState(new CabineReserve(cabineNaval)); // Changer l'état du Cabine pour CabineReserve
	}
}