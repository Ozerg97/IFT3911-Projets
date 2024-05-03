public interface IObserver {
	IResultatRecherche resultat = null;

    public void update();
    public void setSubject(IResultatRecherche s);

}