import java.util.List;

public interface IResultat {

	List<IObserver> observers = null;
	EtatConnexion etatC = null;
	List<String> reservations = null;
	List<String> voyages = null;
	
	void attach(IObserver obs);
	void detach(IObserver obs);
	void notifyObs();

	

}