package TGN1;

public class Acomodadores extends Empleados implements paraAcomodadores{
    private Salas sala;

    public Acomodadores(String nombre, int edad, String tipo, double sueldo) {
        super(nombre, edad, tipo, sueldo);
    }


    public void datosPersona(String nombre, int edad) {

    }


    public void tipoPersona(String tipo) {

    }

    public void setSala(Salas sala) {

        this.sala = sala;
    }

    @Override
    public void getSala(Salas sala) {

    }


    public String getTipo() {

        return super.getTipo();
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " - " + "Edad: " +getEdad() +" años - " + "Tipo:" + getTipo() +" - " +
                "Sueldo: " + getSueldo() +" - " +
                "Pertenece a Sala: " + sala.getNombre()+".";
    }
}
