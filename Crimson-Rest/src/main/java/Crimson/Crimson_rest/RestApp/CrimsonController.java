package Crimson.Crimson_rest.RestApp;

import Crimson.Crimson_rest.JSON_Holders.HPelicula;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrimsonController {

    private static final String template = "Esta es:";

    @RequestMapping("/pelicula")
    public HPelicula getPelicula() {
        return new HPelicula(null,null,null,null,null,null);
    }

}
