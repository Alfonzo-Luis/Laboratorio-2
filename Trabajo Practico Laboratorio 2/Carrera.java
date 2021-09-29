package com.company;

import java.util.LinkedList;


class Carrera {
    private String nombre;
    private LinkedList<Materia> coleccionMaterias;

    public Carrera(String nombre){
        this.nombre=nombre;
        this.coleccionMaterias= new LinkedList<Materia>();
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void agregarMateria(Materia materia){
        this.coleccionMaterias.add(materia);
    }
    public void eleminarMateria(String materia){
        coleccionMaterias.remove(materia);
    }
    public void encontrarMateria(String materia){
        if(coleccionMaterias.contains(materia)) {
            String eliminar = "n";
            System.out.println("Desea eliminar la materia y/ para si n/ para no?");
            System.in.read();
            if(eliminar == "y"){
                eleminarMateria(materia);
            }
        }
    }
    public String toString(){
        return "Carrera= " + nombre + "\n" + "Materrias= " +coleccionMaterias;
    }
}
