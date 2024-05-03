public abstract class CompagnieTransport {
	private String nom;
	private String code;

	public CompagnieTransport(String nom, String code){
		this.nom = nom;
		this.code = code;
	}

	public String getNom() {return nom;}

	public String getCode() {return code;}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setCode(String code) {
		this.code = code;
	}
}