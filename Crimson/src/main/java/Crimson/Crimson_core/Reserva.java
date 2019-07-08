package Crimson.Crimson_core;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    private int asientos;

    private int dniUsuario;

    private int numeroSala;

    private String emailReserva;

    private String nombrePelicula;

    @OneToOne(cascade=CascadeType.ALL)
    private Funcion funcionReservada;

    public Reserva(int asientos, int dniUser, String emailReserva, String nombre, Funcion funcion){
        this.asientos = asientos;
        this.dniUsuario = dniUser;
        this.numeroSala = funcion.getNumeroSala();
        this.emailReserva = emailReserva;
        this.nombrePelicula = nombre;
        this.funcionReservada = funcion;
        this.date = new Date();
    }

    public Reserva() {}

    public int getAsientos() {
        return asientos;
    }

    public long getId() {
        return this.id;
    }

    public int getDniUsuario() {
        return dniUsuario;
    }

    public int getNumeroSala(){
        return numeroSala;
    }

    public String getNombrePelicula(){ return nombrePelicula; }

    public Funcion getFuncion() {return funcionReservada; }

    public String getEmailReserva() {return emailReserva; }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
