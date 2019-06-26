package Crimson.Crimson_core.JSON_Holders;

import java.util.List;

public class HSala {

    private final int numeroSala;
    private final List<HAsiento> asientosSala;
    private final int cantidadAsientos;
    private final int asientosOcupados;
    private final String tipoSala;

    public HSala(int numeroSala, List<HAsiento> asientosSala, int cantidadAsientos, int asientosOcupados, String tipoSala) {
        this.numeroSala = numeroSala;
        this.asientosSala = asientosSala;
        this.cantidadAsientos = cantidadAsientos;
        this.asientosOcupados = asientosOcupados;
        this.tipoSala = tipoSala;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public List<HAsiento> getAsientosSala() {
        return asientosSala;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public int getAsientosOcupados() {
        return asientosOcupados;
    }

    public String getTipoSala() {
        return tipoSala;
    }
}
