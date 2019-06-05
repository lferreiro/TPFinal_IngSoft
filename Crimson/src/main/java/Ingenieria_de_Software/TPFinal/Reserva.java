package Ingenieria_de_Software.TPFinal;

import java.util.List;

public class Reserva {

    private List<Asiento> asientos;
    private int dniUsuario;
    private int numeroSala;

    public Reserva(List<Asiento> asiento, int dniUser, int nSala){
        this.asientos = asiento;
        this.dniUsuario = dniUser;
        this.numeroSala = nSala;
    }

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
