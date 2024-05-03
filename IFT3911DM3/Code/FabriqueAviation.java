public class FabriqueAviation extends FabriqueTransport {

	private static FabriqueAviation aviationFactory;

	// Singleton appliqué
	private FabriqueAviation() {
	}

	public static FabriqueAviation getFabriqueAviation() {
		if (aviationFactory == null) {
			aviationFactory = new FabriqueAviation();
		}
		return aviationFactory;

	}

	public InfrastructureTransport createInfrastructureTransport() {
		return new Aeroport(null, null);
	}

	public CompagnieTransport createCompagnieTransport() {
		return new CompagnieAerienne(null, null);
	}

	public Voyage createVoyage() {
		return new VolAerien(null, null, null, null, null, null, null, null, null, null);
		}

}