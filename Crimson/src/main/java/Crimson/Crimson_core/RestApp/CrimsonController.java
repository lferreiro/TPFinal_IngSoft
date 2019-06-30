package Crimson.Crimson_core.RestApp;

import Crimson.Crimson_core.Cartelera;
import Crimson.Crimson_core.Dummys.DataLoader;
import Crimson.Crimson_core.Funcion;
import Crimson.Crimson_core.JSON_Classes.DatosPeliUser;
import Crimson.Crimson_core.JSON_Holders.HPelicula;
import Crimson.Crimson_core.JSON_Holders.HSala;
import Crimson.Crimson_core.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CrimsonController {

    private static final String template = "Esta es:";
    @Autowired
    private Intermodelo intermodelo;

    @Autowired
    private JavaMailSender javaMailSender;

//    @PostConstruct
//    public void initialize() {
//        DataLoader loader = new DataLoader();
//        Cartelera cartelera = new Cartelera();
//        loader.crearSetDeDatos(cartelera);
//        DataManager dataManager = new DataManager(cartelera);
//        Intermodelo intermodelo = new Intermodelo(dataManager);
//    }

//    @RequestMapping("/cartelera")
//    public List<HPelicula> getCartelera() {
//
//    }

    @RequestMapping("/pelicula")
    public List<HPelicula> getPelicula() {
        HSala sala = new HSala(3, null, 30, 0, "2D");
        HPelicula peli = new HPelicula("Aladdin", 0001, "Aventura Romantica", "ATP", "Aladdin (Mena Massoud) es un adorable pero desafortunado ladronzuelo enamorado de la hija del Sultán, la princesa Jasmine (Naomi Scott). Para intentar conquistarla, acepta el desafío de Jafar (Marwan Kenzari), que consiste en entrar a una cueva en mitad del desierto para dar con una lámpara mágica que le concederá todos sus deseos. Allí es donde Aladdín conocerá al Genio (Will Smith), dando inicio a una aventura como nunca antes había imaginado", sala);
        List<HPelicula> lista = new ArrayList<>();
        lista.add(peli);
        return lista;
    }

    @RequestMapping("/<usuario>/peli/<codigo_peli>")
    public DatosPeliUser getDatosPelicula() {
        //TODO
        return null;
    }

    @RequestMapping(value = "/postPelicula", method = RequestMethod.POST)
    public HPelicula postPelicula(@RequestParam ("nombre") String nombre, @RequestParam("codigo") Integer codigo, @RequestParam("genero") String genero, @RequestParam("clasificacion") String clasificacion, @RequestParam ("sinopsis") String sinopsis) {
        return new HPelicula(nombre, codigo, genero, clasificacion, sinopsis, null);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity createPelicula(@RequestBody HPelicula pelicula){

        return new ResponseEntity(pelicula, HttpStatus.CREATED);

    }

    @RequestMapping(value = "/emailTest", method = RequestMethod.PUT)
    public void enviarEmail(){

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("miguelenriquebada07@gmail.com");

        msg.setSubject("Testing from Spring Boot");
        msg.setText("Hello World \n Spring Boot Email");

        javaMailSender.send(msg);

    }

    @RequestMapping(value = "/mailReserva", method = RequestMethod.PUT)
    public void sendSimpleMessage(@RequestParam String email, @RequestParam int dniUsuario, @RequestParam String nombrePelicula){
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(email);

        msg.setSubject("Crimson reserva");

        Sala sala1 = new Sala(200, 1, "2D");
        Funcion funcion = new Funcion(sala1, "10-6-19 8:00:00");

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy hh:mm:ss");
        String stringDate = sdf.format(funcion.getDate());

        msg.setText("Hola, gracias por confiar en nosotros. Su reserva para el dia y hora: " + stringDate + " para la pelicula " + nombrePelicula + " en la sala numero " + funcion.getNumeroSala() + " y la reserva esta vinculada al DNI: " + dniUsuario);

        javaMailSender.send(msg);

    }
}




