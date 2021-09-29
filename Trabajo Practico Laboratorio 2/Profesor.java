package com.company;

class Profesor extends Persona{
    private double basico;
    private int antiguedad;

    public Profesor(String nombre, String apellido, int legajo, double basico, int antiguedad) {
        super(nombre, apellido, legajo);
        this.basico = basico;
        this.antiguedad = antiguedad;
    }

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double calcularSueldo(){
        return basico+(basico*10/100)*antiguedad;
    }

    @Override
    public void modificarDatos() {

    }

    @Override
    public String toString() {
        return "Profesor= " + super.toString();
    }
}
