package emergencia;

public class Incendio implements Emergencia{

    private String descripcion;
    private String ubicacion;
    private String nivelGravedad;

    public Incendio(String descripcion,String ubicacion,String nivelGravedad) {
        this.descripcion = descripcion;
        this.ubicacion =  ubicacion;
        this.nivelGravedad = nivelGravedad;
    }

    @Override
    public void atender() {
        System.out.println("Atendiendo incendio: " + descripcion);
        System.out.println("Ubicacion" + ubicacion);
        System.out.println("Nivel de gravedad" + nivelGravedad);
    }
}
