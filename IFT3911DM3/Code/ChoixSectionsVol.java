public class ChoixSectionsVol implements IChoixSections {

	private SectionSiegeAvion section;
	protected SectionAvion sAvion;

	public void choixSections(TypeTransport trans) {
        System.out.println("Choix des sections pour le transport " + trans + " effectué.");
    }

    // Méthode spécifique au vol en avion
    public void choixSectionsVol(SectionSiegeAvion section) {
        this.section = section;
		sAvion.choisirSection(section);
	}

}