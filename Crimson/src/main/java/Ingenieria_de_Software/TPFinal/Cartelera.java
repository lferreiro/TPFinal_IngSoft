package Ingenieria_de_Software.TPFinal;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cartelera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cartelera")
    public List<Pelicula> peliculaList;

    public Cartelera(List<Pelicula> peliculas){
        this.peliculaList = peliculas;
    }

    public Cartelera() {}

    public void agregarPelicula(Pelicula pelicula){
        this.peliculaList.add(pelicula);
    }


}
