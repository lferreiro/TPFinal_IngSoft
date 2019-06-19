package Crimson.Crimson_rest.RestApp;

import Crimson.Crimson_rest.JSON_Holders.HPelicula;
import Crimson.Crimson_rest.JSON_Holders.HSala;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrimsonController {

    private static final String template = "Esta es:";

    @RequestMapping("/pelicula")
    public HPelicula getPelicula() {
        HSala sala = new HSala(3, null, 30, 0, "2D");
        return new HPelicula("Aladdin", "Aventura Romantica", "ATP", "Aladdin (Mena Massoud) es un adorable pero desafortunado ladronzuelo enamorado de la hija del Sultán, la princesa Jasmine (Naomi Scott). Para intentar conquistarla, acepta el desafío de Jafar (Marwan Kenzari), que consiste en entrar a una cueva en mitad del desierto para dar con una lámpara mágica que le concederá todos sus deseos. Allí es donde Aladdín conocerá al Genio (Will Smith), dando inicio a una aventura como nunca antes había imaginado", sala);
    }

}
