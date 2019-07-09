package Crimson.Crimson_core.backend.service;

import Crimson.Crimson_core.Funcion;
import Crimson.Crimson_core.Pelicula;
import java.util.List;

public interface CarteleraService {
    public List<Pelicula> getCartelera();
    public void addPelicula(String name, String genero, String clasificacion, List<Funcion> funciones, String sinopsis);
}
