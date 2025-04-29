import java.time.Duration;

import emergencia.Emergencia;
import observer.EmergencyManager;
import serviciosAtencion.Ambulancia;
import serviciosAtencion.Bomberos;
import serviciosAtencion.Policia;
import util.GravedadEmergencia;
import util.TipoEmergencia;

public class App {
    
    public static void main(String[] args) throws Exception {
        Emergencia emergencia = new Emergencia();
        EmergencyManager emergencyManager = new EmergencyManager();

        emergencyManager.addObserver(new Ambulancia());
        emergencyManager.addObserver(new Bomberos());
        emergencyManager.addObserver(new Policia());

        emergencia.setTipo(TipoEmergencia.Accidente_Transito);
        emergencia.setUbicacion("Calle 1 # 3-45");
        emergencia.setNivelDeGravedad(GravedadEmergencia.ALTO);
        emergencia.setTiempoRespuesta(Duration.ofMinutes(15));

        System.out.println("Tipo de Emergencia: " + emergencia.getTipo());
        System.out.println("Ubicación: " + emergencia.getUbicacion());
        System.out.println("Nivel de gravedad: " + emergencia.getNivelDeGravedad());
        System.out.println("Tiempo de respuesta: " + emergencia.getTiempoRespuesta().toMinutes() + " minutos");

        emergencyManager.notifyAllObservers("Se ha presentado una emergencia", emergencia);


    }
}
