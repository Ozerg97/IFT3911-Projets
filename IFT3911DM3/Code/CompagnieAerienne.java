public class CompagnieAerienne extends CompagnieTransport {

	private String vol_id;

	public CompagnieAerienne(String Id_compagnie_aerriene, String vol_id) {
		super(Id_compagnie_aerriene, vol_id);
	}

	public String getvol_id() {
		return vol_id;
	}

	public void setvol_id(String vol_id) {
		this.vol_id = vol_id;
	}

}