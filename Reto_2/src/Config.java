public class Config {

    //instancia de configuracion
    private static Config configuracion;

    //atributos de la configuracion
    private int vehiculosPolicia;
    private int vehiculosAmbulancias;
    private int vehiculosBomberos;
    private int numeroPolicias;
    private int numeroParamedico;
    private int numeroBomberos;

    private Config(int vPolicia, int nPolicias, int vAmbulancias, int nParamedicos, int vBomberos, int nBomberos){
        //configuracion basica inicial
        this.vehiculosPolicia = vPolicia;
        this.vehiculosAmbulancias = vAmbulancias;
        this.vehiculosBomberos = vBomberos;
        this.numeroPolicias = nPolicias;
        this.numeroParamedico = nParamedicos;
        this.numeroBomberos = nBomberos;
    }

    //metodo static para agregar la config de inicio
    public static Config getInstancia(int vPolicia, int nPolicias, int vAmbulancias, int nParamedicos, int vBomberos, int nBomberos) {
        if (configuracion == null) {
            configuracion = new Config(vPolicia,nPolicias,vAmbulancias,nParamedicos,vBomberos,nBomberos);
        }   
        return configuracion;
    }

    public int getVehiculosPolicia() {
        return vehiculosPolicia;
    }

    public void setVehiculosPolicia(int vehiculosPolicia) {
        this.vehiculosPolicia = vehiculosPolicia;
    }
    
    public int getVehiculosAmbulancias() {
        return vehiculosAmbulancias;
    }

    public void setVehiculosAmbulancias(int vehiculosAmbulancias) {
        this.vehiculosAmbulancias = vehiculosAmbulancias;
    }

    public int getVehiculosBomberos() {
        return vehiculosBomberos;
    }

    public void setVehiculosBomberos(int vehiculosBomberos) {
        this.vehiculosBomberos = vehiculosBomberos;
    }

    public int getNumeroPolicias() {
        return numeroPolicias;
    }

    public void setNumeroPolicias(int numeroPolicias) {
        this.numeroPolicias = numeroPolicias;
    }

    public int getNumeroParamedico() {
        return numeroParamedico;
    }

    public void setNumeroParamedico(int numeroParamedico) {
        this.numeroParamedico = numeroParamedico;
    }

    public int getNumeroBomberos() {
        return numeroBomberos;
    }

    public void setNumeroBomberos(int numeroBomberos) {
        this.numeroBomberos = numeroBomberos;
    }
}



