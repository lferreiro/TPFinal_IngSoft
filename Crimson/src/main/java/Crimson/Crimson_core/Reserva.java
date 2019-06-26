package Crimson.Crimson_core;

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

    public Reserva(int asientos, int dniUser, int nSala){
        this.asientos = asientos;
        this.dniUsuario = dniUser;
        this.numeroSala = nSala;
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

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
