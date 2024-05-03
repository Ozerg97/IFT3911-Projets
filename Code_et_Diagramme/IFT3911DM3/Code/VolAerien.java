
import java.util.Date;
import java.util.List;
import java.sql.Time;

public class VolAerien extends Voyage implements  IVisitable {


	private String vol_id;
	private String codeCompagnieAerienne;
	private Aeroport aeroportDepart;
	private Aeroport aeroportArrive;
	private List<Section> sections;
	//private Voyage voyage;

	public VolAerien(Date dateDepart, Time heureDepart, Time heureArrivee, Time duree, Date dateArrive,
			   String vol_id, String codeCompagnieAerienne, Aeroport aeroportDepart, Aeroport aeroportArrive,
			   List<Section> sections) {
		this.dateDepart = dateDepart;
		this.heureDepart = heureDepart;
		this.heureArrivee = heureArrivee;
		this.duree = duree;
		this.dateArrive = dateArrive;
		this.vol_id = vol_id;
		this.codeCompagnieAerienne = codeCompagnieAerienne;
		this.aeroportDepart = aeroportDepart;
		this.aeroportArrive = aeroportArrive;
		this.sections = sections;
	}

	public String getvol_id() {return vol_id;}
	public String getCodeCompagnieAerienne() {return codeCompagnieAerienne;}
	public Aeroport getAeroportDepart() {return aeroportDepart;}
	public Aeroport getAeroportArrive() {return aeroportArrive;}
	public List<Section> getSections() {return sections;}

	public void setvol_id(String vol_id) {this.vol_id = vol_id;}
	public void setCodeCompagnieAerienne(String codeCompagnieAerienne) {this.codeCompagnieAerienne = codeCompagnieAerienne;}
	public void setAeroportDepart(Aeroport aeroportDepart) {this.aeroportDepart = aeroportDepart;}
	public void setAeroportArrive(Aeroport aeroportArrive) {this.aeroportArrive = aeroportArrive;}
	public void setSections(List<Section> sections) {this.sections = sections;}



	/**
	 * 
	 * @param v
	 */
	public void accept(IVisiteur v) {
		v.visitVol(this);
	}

	@Override
	public void annulerVoyage(String reservationNumber) {
		System.out.println("Vous venez d'annuler votre vol du reservation number : " + reservationNumber);
	}

}