package emergencia;

public class Robo implements Emergencia{

    private String descripcion;
    private String ubicacion;
    private String nivelGravedad;

    public Robo(String descripcion,String ubicacion,String nivelGravedad) {
        this.descripcion = descripcion;
        this.ubicacion =  ubicacion;
        this.nivelGravedad = nivelGravedad;
    }

    @Override
    public void atender() {
        System.out.println("Atendiendo Robo: " + descripcion);
        System.out.println("Ubicacion" + ubicacion);
        System.out.println("Nivel de gravedad" + nivelGravedad);
    }
}
