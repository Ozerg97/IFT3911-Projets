public class ChoixSectionsTrajet implements IChoixSections {

	private SectionSiegeTrain section;
	protected SectionTrain sTrain;

	public void choixSections(TypeTransport trans) {
        
        System.out.println("Choix des sections pour le transport " + trans + " effectué.");
    }

    // Méthode spécifique au trajet en train
    public void choixSectionTrajet(SectionSiegeTrain section) {
        this.section = section;
		sTrain.choisirSection(section);
        
    }

}