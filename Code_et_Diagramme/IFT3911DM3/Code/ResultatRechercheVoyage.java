import java.util.ArrayList;
import java.util.List;

public class ResultatRechercheVoyage implements IResultat{

	private List<String> voyages;
	private List<String> reservations;
	private List<IObserver> obs;
	private EtatConnexion etatC;

	public ResultatRechercheVoyage() {
		obs = new ArrayList<>();
        reservations = new ArrayList<String>();
        voyages = new ArrayList<String>();
	}
	
	public void attach(IObserver o) {
		obs.add(o);
		
	}

	public void detach(IObserver o) {
		obs.remove(o);
	}

	public void notifyObs() {
		for (IObserver o : obs) {
            o.update();
        }
	}

	public List<String> getReservations() {
		return this.reservations;
	}

	
	public void setReservations(List<String> res) {
		this.reservations = res;
        notifyObs();
	}

	public List<String> getVoyages() {
		return voyages;
	}

	/**
	 * 
	 * @param s
	 */
	public void setVoyages(List<String> s) {
		this.voyages = s;
	}

	

	public void setEtatConnexion(EtatConnexion etat) {
		this.etatC = etat;
        notifyObs();
	}

	



}