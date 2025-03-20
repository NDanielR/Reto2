import java.util.Scanner;

public class Menu {

    public void MenuPrincipal (){
        System.out.println("Bienvenidos al Sistema de Emergencias");
        System.out.println("Seleccione la emergencia que presenta:");
        System.out.println("1. Incendio");
        System.out.println("2. Robo");
        System.out.println("3. accidente de transito");
    }

    public void MenuEspecificacionesEmergencia(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Ubicacion de la emergencia");
        String ubicacion = scn.nextLine();
        System.out.println("Nivel de gravedad");
        String nivelGravedad = scn.nextLine();
        System.out.println("Tiempo estimado de la atencion inicial");
        String tiempo = scn.nextLine();
    }
}
