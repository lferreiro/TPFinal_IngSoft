package Crimson.Crimson_rest;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    private static final String template = "Hola, %s!";
    private final AtomicLong contador = new AtomicLong();

    @RequestMapping("/saludo")
    public Saludo saludar(@RequestParam(value="nombre", defaultValue="Mundo") String nombre) {
        return new Saludo(contador.incrementAndGet(), String.format(template, nombre));
    }
}
