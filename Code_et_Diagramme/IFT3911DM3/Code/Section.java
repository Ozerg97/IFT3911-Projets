import java.util.List;

public abstract class Section {

	private float prix;
	private List<Emplacement> emplacements;
	private int nombre;

	public int getNbSiegesDisponibles(){
		int NbSiegesDisponibles = 0;
		for(Emplacement emplacement: emplacements){
			if(!emplacement.isReserved()){
				NbSiegesDisponibles++;
			}
		}
		return NbSiegesDisponibles;
	}


	public float getPrix() {
		return prix;
	}

	public int getNombre() {
		return nombre;
	}

	public List<Emplacement> getEmplacements() {
		return emplacements;
	}

	/**
	 * 
	 * @param emplacement
	 */
	public void addEmplacement(Emplacement emplacement) {
		
	}

	/**
	 * 
	 * @param emplacement
	 */
	public void deleteEmplacement(Emplacement emplacement) {
		
	}

	public void choisirSection() {
	}

}