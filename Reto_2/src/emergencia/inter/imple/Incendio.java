package emergencia.inter.imple;

import java.util.Scanner;

import emergencia.inter.InEmergencia;

public class Incendio implements InEmergencia{

    private String ubicacion;
    private String descripcion;
    private boolean personasAtrapadas;
    private String nivelGravedad;

    public Incendio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la ubicacion del incendio: ");
        this.ubicacion = scanner.nextLine();
        System.out.println("Ingrese la descripcion del incendio: ");
        this.descripcion = scanner.nextLine();
        
        while (true) {
            System.out.println("Hay personas atrapadas en el incendio (si/no): ");
            String entrada = scanner.nextLine().toLowerCase().trim(); // Normalize input to lowercase before trimming
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
