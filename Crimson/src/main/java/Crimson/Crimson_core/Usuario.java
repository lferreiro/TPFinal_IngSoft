package Crimson.Crimson_core;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Usuario {

    private String nombre;

    @Id
    private int dni;

    private String email;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Reserva> reservas;

    public Usuario(String nombre, int dni, String email){
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.reservas = new ArrayList<>();
    }

    public Usuario() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }


    public void generarReserva(int cantidadAsientos, Pelicula pelicula, Funcion funcion) throws AsientosInsuficientesException{
        reservas.add(pelicula.reservarAsientos(cantidadAsientos, this.dni, funcion));

    }

    public List<Reserva> getReservas(){
        return this.reservas;
    }

    public void generarReservaConFecha(int cantidadAsientos, Pelicula pelicula, Date dateTime, Funcion funcion) throws AsientosInsuficientesException {
        Reserva reserva = pelicula.reservarAsientos(cantidadAsientos, this.dni, funcion);
        reserva.setDate(dateTime);
        this.reservas.add(reserva);
    }
}

