import emergencia.*;
import emergencia.inter.InEmergencia;


public class App {
    
    public static void main(String[] args) throws Exception {

        
       InEmergencia em1 = EmergenciaFactory.crearEmergencia(Menu.SeleccionEmergencia());
       em1.verDatosEmergencia();
    

      
        
        
        

        
    }
}
