package TGN1;

public class Empleados extends Persona{
    private double sueldo;


    public Empleados(String nombre, int edad, String tipo, double sueldo) {
        super(nombre, edad, tipo);
        this.sueldo = sueldo;
    }

    public void datosPersona(String nombre, int edad) {

    }


    public void tipoPersona(String tipo) {

    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String toString() {
        return "Nombre: " + getNombre() + " - " + "Edad: " +getEdad() +" años - " + "Tipo:" + getTipo() +" - " +
                "Sueldo: " + sueldo;
    }

    public String getTipo() {
        return super.getTipo();
    }
}
