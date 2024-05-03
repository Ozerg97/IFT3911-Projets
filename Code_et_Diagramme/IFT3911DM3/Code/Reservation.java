import java.security.SecureRandom;
import java.util.Random;

public class Reservation {

	private boolean isPlaceAvailable;
	private boolean paymentDone;
	private String idReservation;

	/**
	 * 
	 * @param voyage
	 */
	public void reserverSiegeCabine(Voyage voyage) {
		// TODO - implement Reservation.reserverSiegeCabine
		throw new UnsupportedOperationException();
	}

	public String setReservationNumber() {
		// TODO - implement Reservation.setReservationNumber
		// Caractères possibles dans le numéro de réservation
        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new SecureRandom();

        // Construire la chaîne caractère par caractère
        for (int i = 0; i < 10; i++) {
            int randomIndex = random.nextInt(charSet.length());
            stringBuilder.append(charSet.charAt(randomIndex));
        }

        return stringBuilder.toString();
	}

	/**
	 * 
	 * @param num
	 */
	public void payerVoyage(String num) {
		// TODO - implement Reservation.payerVoyage
		throw new UnsupportedOperationException();
	}

	public void choixSection() {
		// TODO - implement Reservation.choixSection
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param voyage
	 */
	public void choixSiegeCabine(Voyage voyage) {
		// TODO - implement Reservation.choixSiegeCabine
		throw new UnsupportedOperationException();
	}

	public void annulerReservation(String reservationNumber) {
		// TODO - implement Reservation.annulerReservation
		throw new UnsupportedOperationException();
	}

}