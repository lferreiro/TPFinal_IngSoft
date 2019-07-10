package Crimson.Crimson_core;

import Crimson.Crimson_core.Dummys.DataLoader;
import org.junit.Before;
import org.junit.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class PeliculaTest {

    private Cartelera carteleraTest;
    private Pelicula peliculaTest1;
    private Pelicula peliculaTest2;
    private Pelicula peliculaTest3;
    private Pelicula peliculaTest4;
    private Pelicula peliculaTest5;
    private Sala sala1;
    private Sala sala2;
    private Sala sala3;
    private Sala sala4;
    private Sala sala5;
    private Funcion funcion1;
    private Funcion funcion2;
    private Funcion funcion3;
    private Funcion funcion4;
    private Funcion funcion5;
    private Funcion funcion6;
    private SimpleDateFormat formatter;
    private Date dateTime;

    @Before
    public void setup(){
        formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


        DataLoader dl = new DataLoader(new Cartelera(new ArrayList<>()));

        carteleraTest = dl.getCartelera();
        peliculaTest1 = dl.getPelicula1();
        peliculaTest2 = dl.getPelicula2();
        peliculaTest3 = dl.getPelicula3();
        peliculaTest4 = dl.getPelicula4();
        peliculaTest5 = dl.getPelicula5();
        sala1 = dl.getSala1();
        sala2 = dl.getSala2();
        sala3 = dl.getSala3();
        sala4 = dl.getSala4();
        sala5 = dl.getSala5();
        funcion1 = dl.getFuncion1();
        funcion2 = dl.getFuncion2();
        funcion3 = dl.getFuncion3();
        funcion4 = dl.getFuncion4();
        funcion5 = dl.getFuncion5();
        funcion6 = dl.getFuncion6();

    }

    @Test
    public void testUsuarioGeneraUnaReservaParaUnaPelicula() throws AsientosInsuficientesException {

        Usuario usuarioTest = new Usuario("xD", 123456, "xd@gmail.com");
        usuarioTest.generarReserva(3, peliculaTest1, funcion1, "xd@gmail.com");
        assertTrue(usuarioTest.getReservas().size() == 1);
        assertEquals(usuarioTest.getReservas().get(0).getDniUsuario(), usuarioTest.getDni());
        assertEquals(usuarioTest.getReservas().get(0).getNumeroSala(), peliculaTest1.getSala(funcion1).getNumeroSala());
    }

    /*@Test
    public void testUsuarioGeneraUnaReservaParaUnaPeliculaConFechaTal() throws ParseException, AsientosInsuficientesException {
        dateTime = formatter.parse("2019-06-18 22:15:00");

        Sala salaPelicula = new Sala(30, 1, "2D");
        Pelicula peliculaTest = new Pelicula("Scott Pilgrim vs The World", "Comedia", "+13", "", salaPelicula, carteleraTest );
        Usuario usuarioTest = new Usuario("xD", 123456, "xd@gmail.com");
        usuarioTest.generarReservaConFecha(3, peliculaTest, dateTime);

        Reserva reserva = usuarioTest.getReservas().get(0);

        assertEquals(formatter.format(reserva.getDate()), "2019-06-18 22:15:00");
    }
     */

    @Test
    public void testAgregoPeliculasALaCarteleraYAumentaLaCantidadDePeliculasDisponibles(){
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        carteleraTest = new Cartelera(peliculas);
        assertTrue(carteleraTest.peliculaList.size() == 0);
        carteleraTest.agregarPelicula(peliculaTest1);
        carteleraTest.agregarPelicula(peliculaTest2);
        carteleraTest.agregarPelicula(peliculaTest3);
        carteleraTest.agregarPelicula(peliculaTest4);
        carteleraTest.agregarPelicula(peliculaTest5);
        assertEquals(carteleraTest.peliculaList.size(), 5);
    }

    @Test
    public void usuarioReservaAsientosParaUnaPeliculaYLosAsientosOcupadosDeLaSalaAumentan() throws AsientosInsuficientesException {

        Usuario usuarioTest = new Usuario("xD", 123456, "xd@gmail.com");
        usuarioTest.generarReserva(3, peliculaTest2, funcion2, "xd@gmail.com");
        Sala salaPelicula = peliculaTest2.getSala(funcion2);
        assertEquals(funcion2.getAsientosOcupados(), 3);

    }

    @Test
    public void usuarioReservaTodosLosAsientosDeUnaPeliculaYLaSalaQuedaLlena() throws AsientosInsuficientesException {

        Usuario usuarioTest = new Usuario("xD", 123456, "xd@gmail.com");
        usuarioTest.generarReserva(45, peliculaTest2, funcion6, "xd@gmail.com");
        Sala salaPelicula = peliculaTest2.getSala(funcion2);
        assertTrue(funcion6.estaLlena());

    }

}

