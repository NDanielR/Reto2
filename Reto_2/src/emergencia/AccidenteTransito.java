package emergencia;

public class AccidenteTransito implements Emergencia{

    private String descripcion;
    private String ubicacion;
    private String nivelGravedad;

    public AccidenteTransito(String descripcion,String ubicacion,String nivelGravedad) {
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
