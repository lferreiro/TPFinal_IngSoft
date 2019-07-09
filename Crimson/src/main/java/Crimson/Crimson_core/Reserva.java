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

    public void setId(long id) {
        this.id = id;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public void setDniUsuario(int dniUsuario) {
        this.dniUsuario = dniUsuario;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public void setEmailReserva(String emailReserva) {
        this.emailReserva = emailReserva;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public void setFuncionReservada(Funcion funcionReservada) {
        this.funcionReservada = funcionReservada;
    }
}
