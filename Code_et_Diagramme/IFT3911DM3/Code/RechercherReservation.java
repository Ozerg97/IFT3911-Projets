public class RechercherReservation implements ICommand {

	RechercheVoyage cv;
	private String dateDepart;
	private String date;
	private String transport;
	private String sections;

	RechercherReservation(String dateDepart, String date, String transport, String sections) {
		this.dateDepart = dateDepart;
		this.date = date;
		this.transport = transport;
		this.sections = sections;
	}


	public void execute() {
		cv.rechercherReservation(dateDepart, date, transport, sections);
	}

	public void setReceiver(RechercheVoyage cv) {
		this.cv = cv;
	}

}