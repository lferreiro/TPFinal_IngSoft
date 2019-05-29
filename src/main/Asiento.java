package main;

import javafx.util.Pair;

public class Asiento {

    private Pair<Integer, Integer> numeroDeAsiento;

    public Asiento(Integer fila, Integer columna){
        this.numeroDeAsiento = new Pair<>(fila, columna);
    }


    public Pair<Integer, Integer> getNumeroDeAsiento() {
        return numeroDeAsiento;
    }

    public void setNumeroDeAsiento(Pair<Integer, Integer> numeroDeAsiento) {
        this.numeroDeAsiento = numeroDeAsiento;
    }
}
