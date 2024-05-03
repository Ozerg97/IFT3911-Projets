public class CabineNaval extends Emplacement {

	private int nombreCabine;
	private EtatCabine cabineEtat;

	/**
	 * 
	 * @param nombreCabine
	 */
	public CabineNaval(int nombreCabine) {
		cabineEtat = new CabineLibre(this);
		this.nombreCabine = nombreCabine;
	}

	public void setState(EtatCabine cabineEtat) { 
		this.cabineEtat = cabineEtat;
	}

	public Boolean isReserved() {
		if ((cabineEtat instanceof CabineReserve) || (cabineEtat instanceof CabineOccupe)) { 
			System.out.println("La cabine est reservé");
		return true;
		}
		else {
			System.out.println("La cabine n'est pas reservé");
			return false;
		}
	}

}