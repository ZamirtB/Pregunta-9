package unac.edu.co;

public class Inquilino {
    private  String NombreInquilino;

    public Inquilino() {
    }

    public Inquilino(String nombreInquilino) {
        NombreInquilino = nombreInquilino;
    }

    public String getNombreInquilino() {
        return NombreInquilino;
    }

    public void setNombreInquilino(String nombreInquilino) {
        NombreInquilino = nombreInquilino;
    }
}
