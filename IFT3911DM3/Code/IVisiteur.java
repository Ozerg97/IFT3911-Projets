public interface IVisiteur {

	
	StringBuilder visitVol(VolAerien v);
	StringBuilder visitTrajet(TrajetTrain t);
	StringBuilder visitItineraire(ItineraireNaval i);

}