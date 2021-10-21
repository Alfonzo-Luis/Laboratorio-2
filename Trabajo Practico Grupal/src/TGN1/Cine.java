package TGN1;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Cine {
    public static void main(String[] args){
        int cont = 1;
        int salaUno = 0;
        int edad=0;
        int silla=0;
        String opcion;



        Scanner scNombre = new Scanner(System.in);
        Scanner scNumero = new Scanner(System.in);


        Salas sala1 = new Salas(3, "01");
        Acomodadores acomodador = new Acomodadores ("Juan", 32, " Acomodador", 50000);
        Empleados empleado = new Empleados("Stella", 22," Empleado", 40000);



        do {
            Espectadores espectador = new Espectadores();
            System.out.println("¿Desea agregar espectadores?");
            System.out.println("1- Si\n0- No");
            opcion = scNombre.nextLine();

            while (!Utils.isNumeric(opcion)) {
                System.out.println("Error. Ingresar sólo números. Continuar agregando: 1 - Finalizar: 0");
                opcion = scNombre.nextLine();
            }

            while (!(opcion.equals("0") || opcion.equals("1"))) {
                System.out.println("Error. Continuar agregando: 1 - Finalizar: 0");
                opcion = scNombre.nextLine();

            }


            if (opcion.equals("0")){
                sala1.setPelicula("Joker");
                System.out.println(sala1.toString());
                System.out.println("SALA SIN ESPECTADORES CARGADOS.");
                break;
            }


            System.out.println("Ingrese el nombre del espectador Nº: " + cont);
            espectador.setNombre(controlPalabras(scNombre.nextLine()));

            System.out.println("Edad del espectador: ");

            if (controlNumerico()) {
                espectador.setEdad(edad);
            } else {
                System.out.println("ERROR EN EL INGRESO DE DATOS. ¡Ingrese número!");
                espectador.setEdad(edad);
            }

            
            System.out.println("Fila: ");
            espectador.setFila(controlPalabras(scNombre.nextLine()));

            System.out.println("Silla: ");

            if (controlNumerico()) {
                espectador.setSilla(silla);
            }else {
                System.out.println("ERROR EN EL INGRESO DE DATOS. ¡Ingrese número!");
                espectador.setSilla(silla);
            }

            sala1.agregarEspectador(espectador);


            System.out.println("Continuar agregando: 1 - Finalizar: 0");
            opcion = scNombre.nextLine();

            while (!Utils.isNumeric(opcion)) {
                System.out.println("Error. Ingresar sólo números. Continuar agregando: 1 - Finalizar: 0");
                opcion = scNombre.nextLine();
            }

            while (!(opcion.equals("0") || opcion.equals("1"))) {
                System.out.println("Error. Continuar agregando: 1 - Finalizar: 0");
                opcion = scNombre.nextLine();
                System.out.println("Error. Ingrese sólo 0 o 1.");

            }

            cont++;
            salaUno++;

            if (salaUno >= 3) {
                System.out.println("Error. Ha sobre pasado el límite de espectadores. Los datos obtenidos son: ");
                break;
            }
        } while (!opcion.equals("0"));

        sala1.setPelicula("Joker");
        acomodador.setSala(sala1);
        System.out.println(sala1.toString());

        System.out.println("Personal: ");
        System.out.println(empleado.toString());
        System.out.println(acomodador.toString());


// Modificar sala del acomodador
        System.out.println("¿Desea la sala del acomodador?");
        System.out.println("1- Si\n0- No");
        opcion = scNombre.nextLine();

        while (!Utils.isNumeric(opcion)) {
            System.out.println("Error. Ingresar sólo números. Continuar agregando: 1 - Finalizar: 0");
            opcion = scNombre.nextLine();
        }

        while (!(opcion.equals("0") || opcion.equals("1"))) {
            System.out.println("Error. Continuar agregando: 1 - Finalizar: 0");
            opcion = scNombre.nextLine();
        }

        if (opcion.equals("0")){
            System.out.println("No se modificaron datos");

        }else{
            System.out.println("Ingrese la sala acomodador: ");
            sala1.setNombre(scNombre.nextLine());
            acomodador.setSala(sala1);
            System.out.println("Ha modificado el sueldo del acomodador, quedando de la siguiente forma: ");
            System.out.println(acomodador.toString());

        }

//Modificar sueldo del acomodador
        System.out.println("¿Desea modificar el sueldo del acomodador?");
        System.out.println("1- Si\n0- No");
        opcion = scNombre.nextLine();

        while (!Utils.isNumeric(opcion)) {
            System.out.println("Error. Ingresar sólo números. Continuar agregando: 1 - Finalizar: 0");
            opcion = scNombre.nextLine();
        }

        while (!(opcion.equals("0") || opcion.equals("1"))) {
            System.out.println("Error. Continuar agregando: 1 - Finalizar: 0");
            opcion = scNombre.nextLine();
        }

        if (opcion.equals("0")){
            System.out.println("Gracias por elegirnos.");

        }else{
            System.out.println("Ingrese el nuevo sueldo acomodador: ");
            double cheque = scNumero.nextInt();
            acomodador.setSueldo(cheque);
            System.out.println("Ha modificado el sueldo del acomodador, quedando de la siguiente forma: ");
            System.out.println(acomodador.toString());

        }

    }

    //Controladores
    //Controlador de palabras/caracteres
    public static String controlPalabras(String palabra) {

        Scanner scLetras = new Scanner(System.in);

        String palabras;

        while (Utils.isNumeric(palabra)) {
            System.out.println("ERROR EN EL INGRESO DE DATOS. Ingrese caracteres o palabras.");
            palabra = scLetras.nextLine();
        }
        palabras = palabra;

        return palabras;
    }
    //Controlador de Numeros
    public static boolean controlNumerico() {
        Scanner scan = new Scanner(System.in);
        int nro;
        try {
            nro = scan.nextInt();
            return true;
        } catch (InputMismatchException e) {
            return false;
        }    }
}

