package Crimson.Crimson_core;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Sala {

    @Id
    private int numeroSala;

    private int cantidadAsientos;


    private String tipoSala;


    public Sala(int cantidadDeAsientos, int numeroSala, String tipoSala){
        this.cantidadAsientos = cantidadDeAsientos;
        this.numeroSala = numeroSala;
        this.tipoSala = tipoSala;
    }

    public Sala() {}

    public int getAsientosSala(int cantAsientos) throws AsientosInsuficientesException {
        return cantAsientos;
    }

    public void setAsientosSala(int asientosSala) {
        this.cantidadAsientos = asientosSala;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getCantidadAsientos(){
        return cantidadAsientos;
    }

}
