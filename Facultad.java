package com.company;

import java.util.LinkedList;

class Facultad{
    private String nombre;
    private LinkedList<Carrera> coleccionCarrera;

    public Facultad(String nombre){
        this.nombre=nombre;
        this.coleccionCarrera= new LinkedList<Carrera>();
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void agregarCarrera(Carrera carrera){
        coleccionCarrera.add(carrera);

    }
    public void eliminarCarrera(String nombre){
        coleccionCarrera.remove(nombre);
    }
    public void eleminiarEstudiante(Estudiante estudiante){
        coleccionCarrera.remove(estudiante);
    }

    @Override
    public String toString() {
        return "Facultad= " +  nombre + "\n" + "Carreras= " + "\n" + coleccionCarrera;
    }
}
