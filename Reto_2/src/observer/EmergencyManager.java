package observer;

import java.util.ArrayList;
import java.util.List;

import emergencia.Emergencia;

public class EmergencyManager implements IObservable{
    private final List<IObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAllObservers(String message, Emergencia datosEmergencia) {
        for(IObserver observer : observers){
            observer.notifyObserver(message, datosEmergencia);
        }
    }


}
