import util.Config;
import util.Menu;

public class App {  
    public static void main(String[] args) {

        try {
            Config.getInstancia(); // Inicializa la configuración
            //Config.imprimirConfiguracion(Config.getInstancia()); // Imprime la configuración inicial
            
            Menu.MenuPrincipal();//menu de inicio
            
            /*InEmergencia em1 = *///EmergenciaFactory.crearEmergencia(Menu.SeleccionEmergencia());//Crear Emergencia
            //1em1.verDatosEmergencia();
            
            //EmergenciaFactory.imprimirEmergenciasRegistradas();

            /*EmergenciaContexto ec1=new EmergenciaContexto(new EstrategiaAccidenteTransito());//estrategia en contruccion
            ec1.prioridadAlta();
            Config.imprimirConfiguracion(Config.getInstancia());*/

        } finally {
           // ScannerSingleton.close(); // Cierra el Scanner al final del programa
        }
    }
}
