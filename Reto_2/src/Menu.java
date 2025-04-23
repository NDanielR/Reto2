import java.util.Scanner;
import emergencia.inter.imple.TipoEmergencia;
import util.ScannerSingleton;

public class Menu {

    public static Config MenuConfiguracion() {
        return Config.getInstancia();
    }

    public void MenuPrincipal() {
        System.out.println("Bienvenidos al Sistema de Emergencias");
        System.out.println("Seleccione la emergencia que presenta:");
        System.out.println("1. Incendio");
        System.out.println("2. Robo");
        System.out.println("3. accidente de transito");
    }

    public static TipoEmergencia SeleccionEmergencia() {
        Scanner scn = ScannerSingleton.getInstance();
        int opcion = 0;
        while (true) {
            System.out.println("Seleccione la emergencia que presenta:");
            System.out.println("1. Incendio");
            System.out.println("2. Robo");
            System.out.println("3. Accidente de tránsito");


            try {
                opcion = Integer.parseInt(scn.nextLine());


                switch (opcion) {
                    case 1:
                        return TipoEmergencia.Incendio;
                    case 2:
                        return TipoEmergencia.Robo;
                    case 3:
                        return TipoEmergencia.Accidente_Transito;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Ingrese un número del 1 al 3.\n");
            }
        }
    }

}
