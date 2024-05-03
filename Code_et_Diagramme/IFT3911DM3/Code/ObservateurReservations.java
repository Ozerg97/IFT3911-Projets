import java.util.List;


public class ObservateurReservations implements IResultat {

	private List<String> reservations;
	private ResultatRechercheVoyage resultat; 
	private List<IObserver> observers;
	private ControleurReservation cr;
	

	ObservateurReservations(ControleurReservation cr) {
		this.cr = cr;
		
	}

	public void update() {
		reservations = resultat.getReservations();
		cr.modifierReservation(reservations);
	}

	public List<String> getReservation() {
		return reservations;
	}

	@Override
	public void attach(IObserver obs) {
		observers.add(obs);
	}

	@Override
	public void detach(IObserver obs) {
		observers.remove(obs);
	}

	@Override
	public void notifyObs() {
		for (IObserver o : observers) {
            o.update();
        }
	}

}