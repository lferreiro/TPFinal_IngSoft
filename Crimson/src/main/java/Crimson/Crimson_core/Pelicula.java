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

    private String trailer;

    private String imagen;

    @ManyToOne(cascade=CascadeType.ALL)
    private Cartelera cartelera;

    @OneToMany(cascade=CascadeType.ALL)
    private List<Funcion> funciones = new ArrayList<>();

    public Pelicula(String nombreP, String generoP, String clasificacionP, List<Funcion> funcionesP, Cartelera carteleraP, String trailer, String imagen,String sinopsis){
        this.nombre = nombreP;
        this.genero = generoP;
        this.trailer = trailer;
        this.imagen = imagen;
        this.clasificacion = clasificacionP;
        this.sinopsis = sinopsis;
        this.funciones = funcionesP;
        this.cartelera = carteleraP;
    }

    public Pelicula(String nombreP, String generoP, String clasificacionP, List<Funcion> funcionesP, String trailer, String imagen ,String sinopsis) {
        this.nombre = nombreP;
        this.genero = generoP;
        this.trailer = trailer;
        this.imagen = imagen;
        this.clasificacion = clasificacionP;
        this.funciones = funcionesP;
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

    public Reserva reservarAsientos(int cantidadAsientos, int dniUsuario, Funcion funcion, String email) throws AsientosInsuficientesException {
        return new Reserva(funcion.getAsientosSala(cantidadAsientos), dniUsuario, email, this.getNombre(), funcion);
    }

    public Sala getSala(Funcion funcion){
        return funcion.getSala();
    }

    public Cartelera getCartelera() {
        return this.cartelera;
    }

    public void setCartelera(Cartelera cartelera) {
        this.cartelera = cartelera;
    }

    public List<Funcion> getFunciones() {
        return this.funciones;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }


    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
