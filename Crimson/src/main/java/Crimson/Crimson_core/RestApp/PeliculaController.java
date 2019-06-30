package Crimson.Crimson_core.RestApp;

import Crimson.Crimson_core.Pelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
//@RequestMapping(path="/demo")
//public class PeliculaController {
//    @Autowired
//    private PeliculaRepository peliculaRepository;
//
//    @GetMapping(path="/add") // Map ONLY GET Requests
//    public @ResponseBody String addNewPelicula (@RequestParam String name
//            , @RequestParam String genero, @RequestParam String clasificacion, @RequestParam String sinopsis) {
//        // @ResponseBody means the returned String is the response, not a view name
//        // @RequestParam means it is a parameter from the GET or POST request
//
//        Pelicula pelicula = new Pelicula();
//        pelicula.setNombre(name);
//        pelicula.setGenero(genero);
//        pelicula.setClasificacion(clasificacion);
//        pelicula.setSinopsis(sinopsis);
//
//        peliculaRepository.save(pelicula);
//
//        return "Saved";
//    }
//
//    @GetMapping(path = "/all")
//    public @ResponseBody Iterable<Pelicula> getAllPeliculas() {
//        return peliculaRepository.findAll();
//    }
//}
