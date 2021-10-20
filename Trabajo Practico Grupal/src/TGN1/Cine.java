package TGN1;

import java.util.Scanner;
public class Cine {
    public static void main(String[] args){
        int cont = 1;
        int salaUno = 0;
        int edad;
        String fila;
        int silla;
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

            try {
                Integer.parseInt(opcion);
            }catch (NumberFormatException nro){
                System.out.println("Error. Ingresar solo numeros. continuar agregando: 1 - Finalizar: 0");
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
            espectador.setNombre(scNombre.nextLine());

            System.out.println("Edad del espectador: ");
            edad = scNumero.nextInt();
            espectador.setEdad(edad);

            
            System.out.println("Fila: ");
            fila = scNombre.nextLine();
            espectador.setFila(fila);

            System.out.println("Silla: ");
            silla = scNumero.nextInt();
            espectador.setSilla(silla);
            sala1.agregarEspectador(espectador);


            System.out.println("Continuar agregando: 1 - Finalizar: 0");
            opcion = scNombre.nextLine();

            try {
                Integer.parseInt(opcion);
            }catch (NumberFormatException nro){
                System.out.println("Error. Ingresar solo numeros. continuar agregando: 1 - Finalizar: 0");
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

        try {
            Integer.parseInt(opcion);
        }catch (NumberFormatException nro){
            System.out.println("Error. Ingresar solo numeros. continuar agregando: 1 - Finalizar: 0");
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

        try {
            Integer.parseInt(opcion);
        }catch (NumberFormatException nro){
            System.out.println("Error. Ingresar solo numeros. continuar agregando: 1 - Finalizar: 0");
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
}

