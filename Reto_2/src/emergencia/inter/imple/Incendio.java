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
        System.out.println("Hay personas atrapadas en el incendio: ");
        this.personasAtrapadas = scanner.nextBoolean();
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
