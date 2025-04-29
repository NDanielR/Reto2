package observer;

import emergencia.Emergencia;

public interface IObservable {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyAllObservers(String message, Emergencia datosEmergencia);
}
