public class FabriqueNavigation extends FabriqueTransport {

	private static FabriqueNavigation navigationFactory;

	// Singleton appliqué
	private FabriqueNavigation() {
	}

	public static FabriqueNavigation getFabriqueNavigation() {
		if (navigationFactory == null) {
			navigationFactory = new FabriqueNavigation();
		}
		return navigationFactory;
	}

	public InfrastructureTransport createInfrastructureTransport() {
		return new Port();
	}

	public CompagnieTransport createCompagnieTransport() {
		return new CompagnieCroisiere(null, null);
	}

	public Voyage createVoyage() {
		return new ItineraireNaval(null, null, null, null, null, null, null, null, null, null, null);
	}

}