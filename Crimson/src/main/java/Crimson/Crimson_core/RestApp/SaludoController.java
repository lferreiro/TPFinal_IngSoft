package Crimson.Crimson_core.RestApp;

import Crimson.Crimson_core.JSON_Holders.Saludo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SaludoController {

    private static final String template = "Hola, %s!";
    private final AtomicLong contador = new AtomicLong();

    @RequestMapping("/saludo")
    public Saludo saludar(@RequestParam(value="nombre", defaultValue="Mundo") String nombre) {
        return new Saludo(contador.incrementAndGet(), String.format(template, nombre));
    }
    //HOLA travis
}
