public class CompagnieCroisiere extends CompagnieTransport {

	private String itineraire_id;

	public CompagnieCroisiere(String idCompagnieCroisiere, String itineraire_id) {
		super(idCompagnieCroisiere, itineraire_id);
	}

	public String getItineraire_id() {
		return itineraire_id;
	}

	public void setItineraire_id(String itineraire_id) {
		this.itineraire_id = itineraire_id;
	}

}