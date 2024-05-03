import java.util.List;

public class ObservateurVoyages implements IResultat {

	private List<String> voyages;
	private ResultatRechercheVoyage resultat; 
	private List<IObserver> observers;
	private ControlleurVoyage cv;
	

	ObservateurVoyages(ControlleurVoyage cv) {
		this.cv = cv;
		
	}

	public void update() {
		voyages = resultat.getVoyages();
		cv.modifierVoyage(voyages);
	}

	public List<String> getVoyages() {
		return voyages;
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