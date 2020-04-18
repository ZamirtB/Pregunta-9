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
        ArrayList<Propietario> regPropietario = new ArrayList<Propietario>();
        ArrayList<Inquilino> regInquilino = new ArrayList<>();
        ArrayList<Inmueble> regInmueble = new ArrayList<>();
        ArrayList<Contrato> regContrato = new ArrayList<>();
        Scanner seleccionar = new Scanner(System.in);
        String opcion;
        int i = 1;

        do {
            System.out.println("Elige una opcion");
            System.out.println("1 Registro de propietario");
            System.out.println("2 Registro del inmueble");
            System.out.println("3 Registro del inquilino");
            System.out.println("4 Registro del contrato");
            System.out.println("5 Salir del registro");

            opcion = seleccionar.next();

            switch (opcion) {
                case "1":
                    System.out.println("Nombre del propietario");
                    String Nombre = seleccionar.next();
                    System.out.println("Tipo de inmueble");
                    String Inmueble = seleccionar.next();
                    System.out.println("Tipo de contrato");
                    int Tiempo = seleccionar.nextInt();
                    Propietario nuePropietario = new Propietario(Nombre, Inmueble, Tiempo);
                    regPropietario.add(nuePropietario);
                    for (int j = 0; j < regPropietario.size(); j++)
                        System.out.println(
                                "Registro exitoso\n los datos registrados son" +
                                        "\n Nombre: " + regPropietario.get(j).getNombre() +
                                        "\n Tipo de inmueble: " + regPropietario.get(j).getTipo() +
                                        "\n Duracion del contrato (meses): " + regPropietario.get(j).getTiempo());
                    opcion = "0";
                    break;

                case "2":
                    System.out.println("Tipo de inmueble");
                    String tipoInmueble = seleccionar.next();
                    System.out.println("¿Desea arrendar o vender?");
                    String tipoContrato = seleccionar.next();
                    Inmueble nueInmueble = new Inmueble(tipoInmueble, tipoContrato);
                    regInmueble.add(nueInmueble);
                    opcion = "0";
                    break;

                case "3":
                    System.out.println("Nombre");
                    String NomInquilino = seleccionar.next();
                    Inquilino nueInquilino = new Inquilino(NomInquilino);
                    regInquilino.add(nueInquilino);
                    for (int j = 0; j < regPropietario.size(); j++)
                        JOptionPane.showMessageDialog(
                                null,
                                "Registro exitoso\n los datos registrados son" +
                                        "\n Nombre: " + regPropietario.get(j).getNombre());
                    opcion = "0";
                    break;

                case "4":
                    System.out.println("Nombre del Arrensatario");
                    String nomInqContrato = seleccionar.next();
                    System.out.println("Nombre del Inquilino");
                    String nombreArrendadorContrato = seleccionar.next();
                    System.out.println("periodo del contrato");
                    int tiemArrenContrato = seleccionar.nextInt();
                    Contrato nueContrato = new Contrato(nomInqContrato, nomInqContrato, tiemArrenContrato);
                    regContrato.add(nueContrato);

                    try {
                        for (int k = 0; k < regPropietario.size(); k++){
                            for (int z= 0; z< regInquilino.size(); z++ ){
                                String str1 = regPropietario.get(k).getNombre();
                                String str2 = regInquilino.get(z).getNombreInquilino();

                                if (str1.contains(regPropietario.get(k).getNombre()) && str2.contains(regInquilino.get(z).getNombreInquilino())) {
                                    JOptionPane.showMessageDialog(null, "Propietario: " + str1 +  " resguistrado en la base de datos");
                                    JOptionPane.showMessageDialog(null, "Propietario: " + str2 +  " registrado  en la base de datos,  Su contrato ha sido un exito");
                                } else {
                                    System.out.println("No existe en la cadena");
                                }
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Algo salio mal");
                    }
                    opcion = "0";
                    break;
                default:
                    System.out.println("Opción invalida.");
                    opcion = "0";

                case "5":
                    System.exit(0);
                    break;

            }

        } while (opcion == "0");

    }
}