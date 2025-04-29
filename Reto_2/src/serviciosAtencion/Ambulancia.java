package serviciosAtencion;

import emergencia.Emergencia;
import observer.IObserver;
import util.TipoEmergencia;

public class Ambulancia implements IObserver{

    @Override
    public void notifyObserver(String message, Emergencia datosEmergencia) {
        if(datosEmergencia.getTipo() == TipoEmergencia.Accidente_Transito){
            System.out.println("Ambulancia notificada: " + message);
        }
    }

    
    }



