import emergencia.*;
import emergencia.inter.InEmergencia;
import emergencia.inter.imple.TipoEmergencia;

public class App {
    
    public static void main(String[] args) throws Exception {

        
       InEmergencia em1 = EmergenciaFactory.crearEmergencia(TipoEmergencia.Incendio);
       em1.verDatosEmergencia();
    

      
        
        
        

        
    }
}
