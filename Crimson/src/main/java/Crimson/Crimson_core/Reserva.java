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

    @OneToMany
    private List<Asiento> asientos;

    private int dniUsuario;

    private int numeroSala;

    public Reserva(List<Asiento> asiento, int dniUser, int nSala){
        this.asientos = asiento;
        this.dniUsuario = dniUser;
        this.numeroSala = nSala;
        this.date = new Date();
    }

    public Reserva() {}

    public List<Asiento> getAsientos() {
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
