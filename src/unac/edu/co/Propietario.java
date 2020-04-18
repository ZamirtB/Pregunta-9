package unac.edu.co;

public class Propietario {
    private String Nombre;
    private String Tipo;
    private int Tiempo;

    public Propietario() {
    }

    public Propietario(String Nombre, String Tipo, int Tiempo) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Tiempo = Tiempo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public void setTiempo(int tiempo) {
        Tiempo = tiempo;
    }
}