public class ChoixSectionsItineraire implements IChoixSections {

	private SectionSiegePaquebot section;
	protected SectionPaquebot sPaquebot;

	public void choixSections(TypeTransport trans) {
        System.out.println("Choix des sections pour le transport " + trans + " effectué.");
    }

    
    public void choixSectionItineraire(SectionSiegePaquebot section) {
        this.section = section;
        sPaquebot.choisirSection(section);
    }

}