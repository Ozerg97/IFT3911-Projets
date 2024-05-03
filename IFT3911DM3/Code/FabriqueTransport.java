public abstract class FabriqueTransport {

	public abstract InfrastructureTransport createInfrastructureTransport();

	public abstract CompagnieTransport createCompagnieTransport();

	public abstract Voyage createVoyage();

}