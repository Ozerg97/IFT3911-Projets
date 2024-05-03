public class LigneTrain extends CompagnieTransport {

	private String trajet_id;

	public LigneTrain(String idLigneTrain, String trajet_id) {
		super(idLigneTrain, trajet_id);
	}

	public String gettrajet_id() {
		return trajet_id;
	}

	public void settrajet_id(String trajet_id) {
		this.trajet_id = trajet_id;
	}
}