import java.time.Duration;

import emergencia.*;
import emergencia.inter.InEmergencia;
import util.GravedadEmergencia;
import util.TipoEmergencia;

public class App {
    
    public static void main(String[] args) throws Exception {

        
       InEmergencia em1 = EmergenciaFactory.crearEmergencia(TipoEmergencia.Accidente_Transito, TipoEmergencia.Accidente_Transito, "Centro", GravedadEmergencia.MEDIO, Duration.ofMinutes(15), "Accidente de dos motocicletas", false, true, false);
       em1.verDatosEmergencia();
    

      
        
        
        

        
    }
}
