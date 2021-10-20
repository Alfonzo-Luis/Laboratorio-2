package TGN1;

import java.util.ArrayList;
import java.util.List;

public class Salas {
    private int capacidad;
    private String pelicula;
    private String nombre;
    private List<Espectadores> espectadores = new ArrayList<Espectadores>() {
    };

    public Salas(int capacidad, String nombre) {
        this.capacidad = capacidad;
        this.nombre = nombre;
        this.espectadores = new ArrayList<Espectadores>();
    }

    public void setPelicula(String pelicula) {

        this.pelicula = pelicula;
    }

    public void agregarEspectador(Espectadores newViewer){

        espectadores.add(newViewer);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getPelicula() {
        return pelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Espectadores> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(List<Espectadores> espectadores) {
        this.espectadores = espectadores;
    }

    public String toString() {
        if(espectadores.size()==0) {
            return "Sala: " + nombre + ".\n"+
                    "Capacidad: " + capacidad +" personas.\n"+
                    "Pelicula: " + pelicula+".";
        } else {
            return
                    "Sala: " + nombre + ".\n"+
                            "Capacidad: " + capacidad + " personas.\n"+
                            "Pelicula: " + pelicula + ".\n"+
                            "Espectadores: "+espectadores +"\n";
        }
    }
}
