package Ingenieria_de_Software.TPFinal;

import java.util.ArrayList;

public class Usuario {

    private String nombre;
    private int dni;
    private String email;
    private ArrayList<Reserva> reservas;

    public Usuario(String nombre, int dni, String email){
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        reservas = new ArrayList<>();
    }

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


    public void generarReserva(int cantidadAsientos, Pelicula pelicula){
        reservas.add(pelicula.reservarAsientos(cantidadAsientos, this.dni));

    }

    public ArrayList<Reserva> getReservas(){
        return this.reservas;
    }
}
