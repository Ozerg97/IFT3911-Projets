public interface ISubjectConnexion {
    void attach(IObserver o);
    void detach(IObserver o);
    void notifyObservers(IObserver o);
    String getUpdate(IObserver o);
    void register(IObserver o);
}
