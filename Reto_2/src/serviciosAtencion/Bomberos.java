package serviciosAtencion;

import emergencia.Emergencia;
import observer.IObserver;
import util.TipoEmergencia;

public class Bomberos implements IObserver{
    @Override
    public void notifyObserver(String message, Emergencia datosEmergencia) {
        if(datosEmergencia.getTipo() == TipoEmergencia.Incendio){
            System.out.println("Bomberos notificados: " + message);
        }
    }
    }
