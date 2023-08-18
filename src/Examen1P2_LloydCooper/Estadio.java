package Examen1P2_LloydCooper;

public class Estadio {
    private String nombreEstadio;
    private String ciudad;
    private int capacidad;
    private Equipo equipo;

    public Estadio(String nombreEstadio, String ciudad, int capacidad, Equipo equipo) {
        this.nombreEstadio = nombreEstadio;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
        this.equipo = equipo;
    }

    public String getNombreEstadio() {
        return nombreEstadio;
    }

    public void setNombreEstadio(String nombreEstadio) {
        this.nombreEstadio = nombreEstadio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    
    private String nombreEquipo(){  
        return this.equipo.getNombreEquipo();
    }
    
    @Override
    public String toString() {
        return "Estadio:\n" +
               "Nombre del Estadio: " + nombreEstadio + "\n" +
               "Ciudad: " + ciudad + "\n" +
               "Capacidad: " + capacidad + "\n" +
               "Equipo dueño: " + nombreEquipo();
    }   
}
