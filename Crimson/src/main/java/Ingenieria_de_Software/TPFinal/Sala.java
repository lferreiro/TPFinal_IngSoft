package Ingenieria_de_Software.TPFinal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Entity
public class Sala {

    @Id
    private int numeroSala;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sala")
    private List<Asiento> asientosSala = new ArrayList<>();

    private int cantidadAsientos;

    private int asientosOcupados;

    private String tipoSala;


    public Sala(int cantidadDeAsientos, int numeroSala, String tipoSala){
        this.asientosOcupados = 0;
        this.cantidadAsientos = cantidadDeAsientos;
        this.numeroSala = numeroSala;
        for (int i = 0 ; i <cantidadDeAsientos; i ++ ){
            asientosSala.add(new Asiento(i, this));
        }
        this.tipoSala = tipoSala;
    }

    public Sala() {}

    public List<Asiento> getAsientosSala(int cantAsientos) {
        List res = new ArrayList();
        if(this.cantidadAsientos > asientosOcupados) {
            for (int i = 0; i < cantAsientos; i++) {
                res.add(asientosSala.get(asientosOcupados));
                asientosOcupados ++;
            }
        }

        return res;
    }

    public void setAsientosSala(ArrayList<Asiento> asientosSala) {
        this.asientosSala = asientosSala;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getAsientosOcupados(){
        return asientosOcupados;
    }

    public int getCantidadAsientos(){
        return cantidadAsientos;
    }
}
