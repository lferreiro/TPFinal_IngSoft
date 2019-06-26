package Crimson.Crimson_core;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Pelicula {

    @Id
    private String nombre;

    private String genero;

    private String clasificacion;

    private String sinopsis;

    @ManyToOne
    private Cartelera cartelera;

    @OneToOne
    private Sala sala;

    public Pelicula(String nombreP, String generoP, String clasificacionP, String sinopsis, Sala salaP, Cartelera carteleraP ){
        this.nombre = nombreP;
        this.genero = generoP;
        this.clasificacion = clasificacionP;
        this.sinopsis = sinopsis;
        this.sala = salaP;
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

    public Reserva reservarAsientos(int cantidadAsientos, int dniUsuario) throws AsientosInsuficientesException {
        return new Reserva(this.sala.getAsientosSala(cantidadAsientos), dniUsuario ,sala.getNumeroSala());
    }

    public Sala getSala(){
        return sala;
    }


}
