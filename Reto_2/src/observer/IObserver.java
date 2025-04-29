package observer;

import emergencia.Emergencia;

public interface IObserver {
    void notifyObserver(String message, Emergencia datosEmergencia);
}
