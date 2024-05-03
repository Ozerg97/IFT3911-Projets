public class FabriqueCheminFer extends FabriqueTransport {

	private static FabriqueCheminFer cheminFerFactory;

	// Singleton appliqué
	private FabriqueCheminFer() {
	}

	public static FabriqueCheminFer getFabriqueCheminFer() {
		if (cheminFerFactory == null) {
			cheminFerFactory = new FabriqueCheminFer();
		}
		return cheminFerFactory;
	}

	public InfrastructureTransport createInfrastructureTransport() {
		return new Gare();
	}

	public CompagnieTransport createCompagnieTransport() {
		return new LigneTrain(null, null);
	}

	public Voyage createVoyage() {
		return new TrajetTrain(null, null, null, null, null, null, null, null, null, null, null);
	}

}