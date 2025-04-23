import emergencia.*;
import emergencia.inter.InEmergencia;
//import util.ScannerSingleton;

public class App {
    
    public static void main(String[] args) {

        try {
            Config.getInstancia(); // Inicializa la configuración
            Config.imprimirConfiguracion(Config.getInstancia()); // Imprime la configuración inicial
            InEmergencia em1 = EmergenciaFactory.crearEmergencia(Menu.SeleccionEmergencia());
            em1.verDatosEmergencia();
        } finally {
           // ScannerSingleton.close(); // Cierra el Scanner al final del programa
        }
    }
}
