import java.util.Date;
import java.util.List;
import java.sql.Time;


public class ItineraireNaval extends Voyage implements  IVisitable {

	private String itineraire_id;
	private List<Port> portsVisite;
	private String codeCompagnieCroisiere;
	private Port portDepart;
	private Port portArrive;
	private List<Section> sections;
	//private Voyage voyage;

	public ItineraireNaval(Date dateDepart, Time heureDepart, Time heureArrivee, Time duree, Date dateArrive,
			   String itineraire_id, String codeCompagnieCroisiere, Port portDepart, Port portArrive, 
			   List<Port> portsVisite, List<Section> sections) {
		this.dateDepart = dateDepart;
		this.heureDepart = heureDepart;
		this.heureArrivee = heureArrivee;
		this.duree = duree;
		this.dateArrive = dateArrive;
		this.itineraire_id = itineraire_id;
		this.codeCompagnieCroisiere = codeCompagnieCroisiere;
		this.portDepart = portDepart;
		this.portArrive = portArrive;
		this.portsVisite = portsVisite;
		this.sections = sections;
	}

	public String getItineraire_id() {return itineraire_id;}
	public String getCodeCompagnieCroisiere() {return codeCompagnieCroisiere;}
	public Port getPortDepart() {return portDepart;}
	public Port getPortArrive() {return portArrive;}
	public List<Port> getPortsVisite() {return portsVisite;}
	public List<Section> getSections() {return sections;}

	public void setItineraire_id(String itineraire_id) {this.itineraire_id = itineraire_id;}
	public void setCodeCompagnieCroisiere(String codeCompagnieCroisiere) {this.codeCompagnieCroisiere = codeCompagnieCroisiere;}
	public void setPortDepart(Port portDepart) {this.portDepart = portDepart;}
	public void setPortArrive(Port portArrive) {this.portArrive = portArrive;}
	public void setPortsVisite(List<Port> portsVisite) {this.portsVisite = portsVisite;}
	public void setSections(List<Section> sections) {this.sections = sections;}

	/**
	 * 
	 * @param v
	 */
	public void accept(IVisiteur v) {
		v.visitItineraire(this);
	}

}