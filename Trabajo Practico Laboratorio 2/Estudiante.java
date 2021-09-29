package com.company;

class Estudiante extends Persona{
    public Estudiante(String nombre, String apellido, int legajo){
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setLegajo(legajo);
    }

    @Override
    public void modificarDatos() {

    }

    @Override
    public String toString() {
        return "Estudiante= " + super.toString();
    }
}
