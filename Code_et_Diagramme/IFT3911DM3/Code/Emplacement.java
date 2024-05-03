public abstract class Emplacement {

	private Reservation uneReservation;

	public Reservation reserverSiegeCabine() {
		return uneReservation;
	}

	public abstract Boolean isReserved();

}