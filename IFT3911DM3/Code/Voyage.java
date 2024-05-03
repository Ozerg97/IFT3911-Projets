import java.sql.Time;
import java.util.Date;

public abstract class Voyage {

	protected Date dateDepart;
	protected Date dateArrive;
	protected String typeVoyage;
	protected Time duree;
	protected Time heureDepart;
	protected Time heureArrivee;

	public Date getDateDepart() {return dateDepart;}
	public Date getDateArrive() {return dateArrive;}
	public String gettypeVoyage() {return typeVoyage;}
	public Time getDuree() {return duree;}
	public Time getHeureDepart() {return heureDepart;}
	public Time getHeureArrivee() {return heureArrivee;}
	

	
	public void setDateDepart(Date dateDepart) {this.dateDepart = dateDepart;}
	public void setDateArrive(Date dateArrive) {this.dateArrive = dateArrive;}
	public void settypeVoyage(String typeVoyage) {this.typeVoyage = typeVoyage;}
	public void setDuree(Time duree) {this.duree = duree;}
	public void setHeureDepart(Time heureDepart) {this.heureDepart = heureDepart;}
	public void setHeureArrivee(Time heureArrivee) {this.heureArrivee = heureArrivee;}

	void annulerVoyage(String reservationNumber){};
	

}
