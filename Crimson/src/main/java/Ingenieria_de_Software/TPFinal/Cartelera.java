package Ingenieria_de_Software.TPFinal;

import java.util.ArrayList;
public class Cartelera {

    ArrayList<Pelicula> peliculaList;

    public Cartelera(ArrayList<Pelicula> peliculas){
        this.peliculaList = peliculas;
    }

    public void agregarPelicula(Pelicula pelicula){
        this.peliculaList.add(pelicula);
    }


}
