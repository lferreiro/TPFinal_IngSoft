package Crimson.Crimson_core;

import javax.persistence.*;
import java.util.List;

@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany
    private List<Asiento> asientos;

    private int dniUsuario;

    private int numeroSala;

    public Reserva(List<Asiento> asiento, int dniUser, int nSala){
        this.asientos = asiento;
        this.dniUsuario = dniUser;
        this.numeroSala = nSala;
    }

    public Reserva() {}

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public int getDniUsuario() {
        return dniUsuario;
    }

    public int getNumeroSala(){
        return numeroSala;
    }
}
