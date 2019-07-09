package Crimson.Crimson_core;

import Crimson.Crimson_core.Dummys.DataLoader;
import Crimson.Crimson_core.backend.service.CarteleraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    CarteleraService carteleraService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Pelicula> peliculas = new DataLoader(new Cartelera(new ArrayList<>())).getCartelera().getPeliculas();

        for(Pelicula pelicula: peliculas) {
            String nombre = pelicula.getNombre();
            String genero = pelicula.getGenero();
            String clasificacion = pelicula.getClasificacion();
            List<Funcion> funciones = pelicula.getFunciones();

            String sinopsis = pelicula.getSinopsis();

            carteleraService.addPelicula(nombre, genero, clasificacion, funciones, sinopsis);
        }
    }
}

