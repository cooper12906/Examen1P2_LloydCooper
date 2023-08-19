package Examen1P2_LloydCooper;

import java.util.Random;

public class Mediocampista extends Jugador {

    public Mediocampista(String nombre, int edad, String nacionalidad, String pieHabil, Equipo equipoJugador) {
        super(nombre, edad, nacionalidad, pieHabil, equipoJugador);
        setAtributos();
        setRating();
    }

   public void setAtributos(){
        Random random = new Random();
        this.agarre = (1 + random.nextInt(5)) * 13;
        this.lanzamiento = (1 + random.nextInt(5)) * 13;
        this.fisico = (1 + random.nextInt(5)) * 13;
        this.ritmo = (1 + random.nextInt(5)) * 13;
        this.entrada = (1 + random.nextInt(5)) * 13;
        this.vision = (1 + random.nextInt(12)) * 12;
        this.passing = (1 + random.nextInt(12)) * 12;
        this.regate = (1 + random.nextInt(12)) * 12;
        this.disparo = (1 + random.nextInt(5)) * 13;
    }
    
   public void setRating(){
        int rat = (passing + fisico + ritmo + entrada + vision + regate + disparo) / 7;
        this.rating = rat;
    }
}
