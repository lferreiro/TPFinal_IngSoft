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

    public Pelicula() {}

    public Reserva reservarAsientos(int cantidadAsientos, int dniUsuario){
        return new Reserva(this.sala.getAsientosSala(cantidadAsientos), dniUsuario ,sala.getNumeroSala());
    }

    public Sala getSala(){
        return sala;
    }


}
