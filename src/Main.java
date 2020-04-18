import unac.edu.co.Contrato;
import unac.edu.co.Inmueble;
import unac.edu.co.Inquilino;
import unac.edu.co.Propietario;
import java.io.IOException;
import java.util.*;
import javax.swing.JOptionPane;
import java.lang.*;
import java.lang.String;


public class Main {
    public static void main(String[] args) {
        ArrayList<Propietario> registroPropietario = new ArrayList<Propietario>();
        ArrayList<Inquilino> registroInquilino = new ArrayList<>();
        ArrayList<Inmueble> registroInmueble = new ArrayList<>();
        ArrayList<Contrato> registroContrato = new ArrayList<>();
        Scanner seleccion = new Scanner(System.in);
        String respuesta;
        int i = 1;
        do {
            System.out.println("Elige una opcion");
            System.out.println("1.- Registro de propietario");
            System.out.println("2.- Registro del inquilino");
            System.out.println("3.- Registrao del inmueble");
            System.out.println("4.- Registro del contrato");

            respuesta = seleccion.next();
            switch (respuesta) {
                case "1":
                    System.out.println("Nombre del propietario");
                    String Nombre = seleccion.next();
                    System.out.println("Tipo de inmueble");
                    String Inmueble = seleccion.next();
                    System.out.println("Tipo de contrato");
                    int Tiempo = seleccion.nextInt();
                    Propietario nuevoPropietario = new Propietario(Nombre, Inmueble, Tiempo);
                    registroPropietario.add(nuevoPropietario);
                    for (int j = 0; j < registroPropietario.size(); j++)
                        System.out.println(
                                "Registro exitoso\n los datos registrados son" +
                                        "\n Nombre: " + registroPropietario.get(j).getNombre() +
                                        "\n Tipo de inmueble: " + registroPropietario.get(j).getTipo() +
                                        "\n Duracion del contrato (meses): " + registroPropietario.get(j).getTiempo());
                    respuesta = "0";
                    break;
                case "2":
                    System.out.println("Nombre");
                    String NombreInquilino = seleccion.next();
                    Inquilino nuevoInquilino = new Inquilino(NombreInquilino);
                    registroInquilino.add(nuevoInquilino);
                    for (int j = 0; j < registroPropietario.size(); j++)
                        JOptionPane.showMessageDialog(
                                null,
                                "Registro exitoso\n los datos registrados son" +
                                        "\n Nombre: " + registroPropietario.get(j).getNombre());
                    respuesta = "0";
                    break;
                case "3":
                    System.out.println("Tipo del inmueble");
                    String tipoInmueble = seleccion.next();
                    System.out.println("¿Desea arrendar o vender?");
                    String tipoContrato = seleccion.next();
                    Inmueble nuevoInmueble = new Inmueble(tipoInmueble, tipoContrato);
                    registroInmueble.add(nuevoInmueble);
                    respuesta = "0";
                    break;
                case "4":
                    System.out.println("Nombre del Inquilino");
                    String nombreInquilinoContrato = seleccion.next();
                    System.out.println("Nombre del Arrendatario");
                    String nombreArrendadorContrato = seleccion.next();
                    System.out.println("periocidad del contrato");
                    int tiempoArrendamientoContrato = seleccion.nextInt();
                    Contrato nuevoContrato = new Contrato(nombreInquilinoContrato, nombreInquilinoContrato, tiempoArrendamientoContrato);
                    registroContrato.add(nuevoContrato);

                    try {
                        for (int k = 0; k < registroPropietario.size(); k++){
                            for (int z= 0; z< registroInquilino.size(); z++ ){
                                String str1 = registroPropietario.get(k).getNombre();
                                String str2 = registroInquilino.get(z).getNombreInquilino();

                                // En las sentencias If-else puedes usar el método contains ()
                                if (str1.contains(registroPropietario.get(k).getNombre()) && str2.contains(registroInquilino.get(z).getNombreInquilino())) {
                                    JOptionPane.showMessageDialog(null, "El propietario: " + str1 +  " esta en nuestra base de datos");
                                    JOptionPane.showMessageDialog(null, "El propietario: " + str2 +  " esta en nuestra base de datos, Felicidades su contrato ha sido exitoso");
                                } else {
                                    System.out.println("La palabra clave: ejemplo: no se encuentra en la cadena");
                                }}}
                    } catch (Exception e) {
                        System.out.println("Something went wrong.");
                    }
                    respuesta = "0";
                    break;
                default:
                    System.out.println("Opción invalida.");
                    respuesta = "0";

            }

        } while (respuesta == "0");

    }
}