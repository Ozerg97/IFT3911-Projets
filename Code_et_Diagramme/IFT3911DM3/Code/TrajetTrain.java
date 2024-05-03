
import java.util.Date;
import java.util.List;
import java.sql.Time;

public class TrajetTrain extends Voyage implements IVisitable {


	private String trajet_id;
	private List<Gare> gareVisite;
	private String codeLigneTrain;
	private Gare gareDepart;
	private Gare gareArrive;
	private List<Section> sections;
	//private Voyage voyage;

	public TrajetTrain(Date dateDepart, Time heureDepart, Time heureArrivee, Time duree, Date dateArrive,
			   String trajet_id, String codeLigneTrain, Gare gareDepart, Gare gareArrive, 
			   List<Gare> gareVisite, List<Section> sections) {
		this.dateDepart = dateDepart;
		this.heureDepart = heureDepart;
		this.heureArrivee = heureArrivee;
		this.duree = duree;
		this.dateArrive = dateArrive;
		this.trajet_id = trajet_id;
		this.codeLigneTrain = codeLigneTrain;
		this.gareDepart = gareDepart;
		this.gareArrive = gareArrive;
		this.gareVisite = gareVisite;
		this.sections = sections;
	}

	public String gettrajet_id() {return trajet_id;}
	public String getCodeLigneTrain() {return codeLigneTrain;}
	public Gare getGareDepart() {return gareDepart;}
	public Gare getGareArrive() {return gareArrive;}
	public List<Gare> getGareVisite() {return gareVisite;}
	public List<Section> getSections() {return sections;}

	public void settrajet_id(String trajet_id) {this.trajet_id = trajet_id;}
	public void setCodeLigneTrain(String codeLigneTrain) {this.codeLigneTrain = codeLigneTrain;}
	public void setGareDepart(Gare gareDepart) {this.gareDepart = gareDepart;}
	public void setGareArrive(Gare gareArrive) {this.gareArrive = gareArrive;}
	public void setGareVisite(List<Gare> gareVisite) {this.gareVisite = gareVisite;}
	public void setSections(List<Section> sections) {this.sections = sections;}



	/**
	 * 
	 * @param v
	 */
	public void accept(IVisiteur v) {
		v.visitTrajet(this);
	}

}