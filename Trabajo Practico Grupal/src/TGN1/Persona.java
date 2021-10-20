package TGN1;

abstract class Persona {
    private String nombre;
    private int edad;
    private String tipo;

    public Persona(String nombre, int edad, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }

    public Persona() {

    }

    public abstract void datosPersona(String nombre, int edad);
    public abstract void tipoPersona(String tipo);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " - " +
                "Edad: " + edad +" - " +
                "Tipo: " + tipo;
    }
}
