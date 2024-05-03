import java.util.List;

public class VoyageVisiteur implements IVisiteur {

	
	public StringBuilder visitVol(VolAerien vol) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(vol.getAeroportDepart())
				.append("-")
				.append(vol.getAeroportArrive())
				.append(":[")
				.append(vol.getCodeCompagnieAerienne())
				.append("]")
				.append(vol.getvol_id())
				.append("(")
				.append(vol.getDateDepart().toString())
				.append(":")
				.append(vol.getHeureDepart().toString())
				.append("-")
				.append(vol.getDateArrive().toString())
				.append(":")
				.append(vol.getHeureArrivee().toString())
				.append(")|");

		List<Section> sections = vol.getSections();
		for (Section section : sections) {
			stringBuilder.append(section.getClass().toString())
					.append("(")
					.append(section.getNbSiegesDisponibles())
					.append("/")
					.append(section.getEmplacements().size())
					.append(")")
					.append(section.getPrix())
					.append("|");
		}

		stringBuilder.deleteCharAt(stringBuilder.length() - 1);
		return stringBuilder;
	}

	/**
	 * 
	 * @param t
	 */
	public StringBuilder visitTrajet(TrajetTrain trajet) {
		
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append(trajet.getGareDepart())
				.append("-")
				.append(trajet.getGareVisite().get(trajet.getGareVisite().size() - 1))
				.append(":")
				.append(trajet.getCodeLigneTrain())
				.append("(")
				.append(trajet.getDateDepart().toString())
				.append(":")
				.append(trajet.getHeureDepart().toString())
				.append("-")
				.append(trajet.getDateArrive().toString())
				.append(":")
				.append(trajet.getHeureArrivee().toString())
				.append(")|");

		List<Section> sections = trajet.getSections();
		for (Section section : sections) {
			stringBuilder.append(section.getClass().toString())
					.append("(")
					.append(section.getNbSiegesDisponibles())
					.append("/")
					.append(section.getEmplacements().size())
					.append(")")
					.append(section.getPrix())
					.append("|");
		}
		stringBuilder.deleteCharAt(stringBuilder.length() - 1);

		return stringBuilder;
	}

	/**
	 * 
	 * @param i
	 */
	public StringBuilder visitItineraire(ItineraireNaval itineraire) {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append(itineraire.getPortDepart())
				.append("-")
				.append(itineraire.getPortsVisite().get(itineraire.getPortsVisite().size() - 1))
				.append(":")
				.append(itineraire.getCodeCompagnieCroisiere())
				.append("(")
				.append(itineraire.getDateDepart().toString())
				.append(":")
				.append(itineraire.getHeureDepart().toString())
				.append("-")
				.append(itineraire.getDateArrive().toString())
				.append(":")
				.append(itineraire.getHeureArrivee().toString())
				.append(")|");

		List<Section> sections = itineraire.getSections();
		for (Section section : sections) {
			stringBuilder.append(section.getClass().toString())
					.append("(")
					.append(section.getNbSiegesDisponibles())
					.append("/")
					.append(section.getEmplacements().size())
					.append(")")
					.append(section.getPrix())
					.append("|");
		}
		return stringBuilder;
	}

	
}