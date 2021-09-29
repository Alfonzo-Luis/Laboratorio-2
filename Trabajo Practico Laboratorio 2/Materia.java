package com.company;

import java.util.LinkedList;

class Materia {
    private String nombre;
    private Profesor titular;
    private LinkedList <Estudiante> coleccionEstudiantes;

    public Materia(String nombre, Profesor titular){
        this.nombre = nombre;
        this.titular = titular;
        this.coleccionEstudiantes = new LinkedList<Estudiante>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setTitular(Profesor titular){
        this.titular=titular;
    }
    public Profesor getTitular() {
        return titular;
    }

    public void agregarEstudiante(Estudiante estudianteNuevo){
        this.coleccionEstudiantes.add(estudianteNuevo);
    }

    public boolean eleminiarEstudiante(int legajo){
        boolean encontro = false;
        for(Estudiante estudiante: coleccionEstudiantes){
            if(estudiante.getLegajo()==legajo){
                coleccionEstudiantes.remove(estudiante);
                encontro = true;
            }
        }
        return encontro;
    }

    @Override
    public String toString() {
        return "Materia= " + nombre + "\n" + "Titular= " + titular + "\n" + "Estudiantes= " +  "\n" +coleccionEstudiantes;
    }

    public void modificarTitular(Profesor titular){
        this.titular = titular;
    }
}
