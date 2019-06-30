package Crimson.Crimson_core;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pelicula {

    @Id
    private String nombre;

    private String genero;

    private String clasificacion;

    private String sinopsis;

    @ManyToOne
    private Cartelera cartelera;

    @OneToMany
    private List<Funcion> funciones = new ArrayList<>();

    public Pelicula(String nombreP, String generoP, String clasificacionP, List<Funcion> funcionesP, Cartelera carteleraP, String sinopsis){
        this.nombre = nombreP;
        this.genero = generoP;
        this.clasificacion = clasificacionP;
        this.sinopsis = sinopsis;
        this.funciones = funcionesP;
        this.cartelera = carteleraP;
    }

    public Pelicula(String nombreP, String generoP, String clasificacionP, String sinopsis) {
        this.nombre = nombreP;
        this.genero = generoP;
        this.clasificacion = clasificacionP;
        this.sinopsis = sinopsis;
    }

    public Pelicula() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Reserva reservarAsientos(int cantidadAsientos, int dniUsuario, Funcion funcion) throws AsientosInsuficientesException {
        return new Reserva(funcion.getAsientosSala(cantidadAsientos), dniUsuario ,funcion.getNumeroSala());
    }

    public Sala getSala(Funcion funcion){
        return funcion.getSala();
    }


}
