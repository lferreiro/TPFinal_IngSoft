package Crimson.Crimson_core;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
@Component
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

    public List<Pelicula> getPeliculas() {
        return this.peliculaList;
    }

}
