public class Siege extends Emplacement {

	private int nombreRangee;
	private char nombreColonne;
	private SiegeEtat siegeEtat;

	/**
	 * 
	 * @param nombreRangee
	 * @param nombreColonne
	 */
	public Siege(int nombreRangee, char nombreColonne) {
		siegeEtat = new SiegeLibre(this);
		this.nombreColonne = nombreColonne; 
		this.nombreColonne = nombreColonne;
	}
	public void setState(SiegeEtat siegeEtat) { 
		this.siegeEtat = siegeEtat;
	}


	public void choisirSiege(int nombreRangee, char nombreColonne) {
		this.nombreColonne = nombreColonne;
		this.nombreRangee = nombreRangee;
		System.out.println("Votre siege est dans la rangee " + nombreRangee + " et dans la colonne " + nombreColonne);
	}

	public Boolean isReserved() {
		if ((siegeEtat instanceof SiegeReservé) || (siegeEtat instanceof SiegeOccupé)) { 
			System.out.println("Le siege est reservé");
		return true;
		}
		else {
			System.out.println("Le siege n'est pas reservé");
			return false;
		}
	}
	

	
}