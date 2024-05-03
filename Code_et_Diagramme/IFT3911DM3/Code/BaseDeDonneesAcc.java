public class BaseDeDonneesAcc {


	private static BaseDeDonneesAcc inst;
	private IResultat resultat;
	private String API;
	private ResultatRechercheVoyage rrv;


	public void baseDeDonneesAcc() {
		API = "API";
		
	}
	public static BaseDeDonneesAcc getInst() {
		if (inst == null) {
			inst = new BaseDeDonneesAcc();
		}
		return inst;
	}

	public void pullLogin(String username, String pwd) {
		if (username == "admin" && pwd == "admin") {
			rrv.setEtatConnexion(EtatConnexion.admin);
		} else if (username == "user" && pwd == "user") {
			rrv.setEtatConnexion(EtatConnexion.user);
		}

	}

	/**
	 * 
	 * @param rech
	 */
	public void getSearch(RechercheVoyage rech) {
		
	}

	/**
	 * 
	 * @param res
	 */
	public void getRes(Reservation res) {
		// TODO - implement BaseDeDonneesAcc.getRes
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param voy
	 */
	public void setVoyage(Voyage voy) {
	}

	/**
	 * 
	 * @param res
	 */
	public void setRes(Reservation res) {
	}

	/**
	 * 
	 * @param inst
	 * @return 
	 */
	

	 public void pushVoyage(Voyage selectedVoyage) {
		// TODO - implement AccesseurDatabase.pushVoyage
		throw new UnsupportedOperationException();
	}
	
}