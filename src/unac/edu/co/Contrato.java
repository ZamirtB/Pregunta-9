package unac.edu.co;

public class Contrato {
    private Propietario nombrePropietario;
    private Inquilino nombreInquilino;
    private Inmueble tipoInmueble;
    private int tiempoDuracionCOntrato;

    public Contrato(String nombreInquilinoContrato, String inquilinoContrato, int tiempoArrendamientoContrato) {
    }

    public Contrato(Propietario nombrePropietario, Inquilino nombreInquilino, Inmueble tipoInmueble, int tiempoDuracionCOntrato) {
        this.nombrePropietario = nombrePropietario;
        this.nombreInquilino = nombreInquilino;
        this.tipoInmueble = tipoInmueble;
        this.tiempoDuracionCOntrato = tiempoDuracionCOntrato;
    }

    public Propietario getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(Propietario nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public Inquilino getNombreInquilino() {
        return nombreInquilino;
    }

    public void setNombreInquilino(Inquilino nombreInquilino) {
        this.nombreInquilino = nombreInquilino;
    }

    public Inmueble getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(Inmueble tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public int getTiempoDuracionCOntrato() {
        return tiempoDuracionCOntrato;
    }

    public void setTiempoDuracionCOntrato(int tiempoDuracionCOntrato) {
        this.tiempoDuracionCOntrato = tiempoDuracionCOntrato;
    }
}