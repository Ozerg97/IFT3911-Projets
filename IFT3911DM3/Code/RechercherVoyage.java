public class RechercherVoyage {

	private String destination;
	private String date;
	private String transport;
	private String sections;
	
	RechercheVoyage rv;

	RechercherVoyage(String destination, String date, String transport, String sections) {
		this.destination = destination;
		this.date = date;
		this.transport = transport;
		this.sections = sections;
	}

	public void execute() {
		rv.rechercherVoyage(destination, date, transport, sections);;
	}

}