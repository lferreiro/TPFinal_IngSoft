package Ingenieria_de_Software.TPFinal;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Asiento {

    @Id
    private int numeroDeAsiento;

    @ManyToOne
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
