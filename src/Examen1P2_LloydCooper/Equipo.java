package Examen1P2_LloydCooper;

import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private String pais;
    private int ratingEquipo;
    private ArrayList <Jugador> plantillas = new ArrayList();

    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.ratingEquipo = 0;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getRatingEquipo() {
        return ratingEquipo;
    }

    public void setRatingEquipo(int ratingEquipo) {
        this.ratingEquipo = ratingEquipo;
    }

    public ArrayList<Jugador> getPlantillas() {
        return plantillas;
    }

    public void setPlantillas(ArrayList<Jugador> plantillas) {
        this.plantillas = plantillas;
    }

    public int updateRating(){
        
        return 0;
    }
    
    @Override
    public String toString() {
        return "Equipo:\n" +
               "Nombre del Equipo: " + nombreEquipo + "\n" +
               "País: " + pais + "\n" +
               "Rating del Equipo: " + ratingEquipo + "\n" +
               "Plantilla: " + plantillas;
    }
}
