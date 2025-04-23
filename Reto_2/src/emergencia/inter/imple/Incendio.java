package emergencia.inter.imple;

import java.util.Scanner;
import emergencia.inter.InEmergencia;
import util.ScannerSingleton;

public class Incendio implements InEmergencia{

    private String ubicacion;
    private String descripcion;
    private boolean personasAtrapadas;
    //private String nivelGravedad;

    public Incendio() {
        Scanner scn = ScannerSingleton.getInstance();//new Scanner(System.in);
        try {
            System.out.println("Ingrese la ubicacion del incendio: ");
            this.ubicacion = scn.nextLine();
            System.out.println("Ingrese la descripcion del incendio: ");
            this.descripcion = scn.nextLine();
            
            while (true) {
                System.out.println("Hay personas atrapadas en el incendio (si/no): ");
                String entrada = scn.nextLine().toLowerCase().trim(); 
                if (entrada.equals("si")) {
                    this.personasAtrapadas = true;
                    break;
                } else if (entrada.equals("no")) {
                    this.personasAtrapadas = false;
                    break;
                } else {
                    System.out.println("Entrada no válida. Por favor, ingrese 'si' o 'no'.");
                }
            }
        } finally {
            //scn.close(); // Cierra el Scanner para evitar advertencias
        }
    }

    @Override
    public void registrarEmergencia() {
      
    }

    @Override
    public void verDatosEmergencia() {
        System.out.println("Atendiendo incendio: " + descripcion);
        System.out.println("Ubicacion" + ubicacion);
        System.out.println("Personas atrapadas: " + personasAtrapadas);
    }
}
