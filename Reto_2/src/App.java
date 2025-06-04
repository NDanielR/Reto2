import util.Config;
import util.Menu;
import util.ScannerSingleton;

public class App {  
    public static void main(String[] args) {

        try {
           
            
            Config.getInstancia(); // Inicializa la configuración         
            Menu.MenuPrincipal();//menu de inicio
                     
            //EmergenciaContexto ec1=new EmergenciaContexto(new EstrategiaAccidenteTransito());//estrategia en contruccion
            //ec1.prioridadAlta();
            //Config.imprimirConfiguracion(Config.getInstancia());

        } finally {
            ScannerSingleton.close(); // Cierra el Scanner al final del programa
        }
    }
}
