package Crimson.Crimson_core;


import javax.persistence.*;

@Entity
public class Asiento {

    @Id
    private int numeroDeAsiento;

    @ManyToOne
    @JoinColumn(name = "Reserva_id", nullable = false)
    private Sala sala;

    public Asiento(Integer numeroDeAsiento, Sala sala) {
        this.numeroDeAsiento = numeroDeAsiento;
        this.sala = sala;
    }

    public Asiento() {}

    public Integer getNumeroDeAsiento() {
        return numeroDeAsiento;
    }

    public void setNumeroDeAsiento(Integer numeroDeAsiento) {
        this.numeroDeAsiento = numeroDeAsiento;
    }
}
