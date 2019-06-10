package Ingenieria_de_Software.TPFinal;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

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

    @Before
    public void setup(){
        sala1 = new Sala(200, 1, "2D");
        sala2 = new Sala(45, 2, "2D");
        sala3 = new Sala(50, 3, "3D");
        sala4 = new Sala (50, 4, "2D");
        sala5 = new Sala(60, 5, "3D");
        peliculaTest1 = new Pelicula("Aladdin", "Aventura Romantica", "ATP", "",sala1, carteleraTest);
        peliculaTest2 = new Pelicula("Detective Pikachu", "Aventura", "ATP", "",sala2, carteleraTest);
        peliculaTest3 = new Pelicula("Avengers Endgame", "Accion", "+13", "" ,sala3, carteleraTest);
        peliculaTest4 = new Pelicula("John Wick 3", "Accion", "+16", "",sala4, carteleraTest);
        peliculaTest5 = new Pelicula("Godzilla 2", "Ciencia Ficcion", "+13", "", sala5, carteleraTest);

    }

    @Test
    public void testUsuarioGeneraUnaReservaParaUnaPelicula(){
        Sala salaPelicula = new Sala(30, 1, "2D");
        Pelicula peliculaTest = new Pelicula("Scott Pilgrim vs The World", "Comedia", "+13", "", salaPelicula, carteleraTest );
        Usuario usuarioTest = new Usuario("xD", 123456, "xd@gmail.com");
        usuarioTest.generarReserva(3, peliculaTest);
        assertTrue(usuarioTest.getReservas().size() == 1);
        assertEquals(usuarioTest.getReservas().get(0).getDniUsuario(), usuarioTest.getDni());
        assertEquals(usuarioTest.getReservas().get(0).getNumeroSala(), peliculaTest.getSala().getNumeroSala());

    }

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
    public void usuarioReservaAsientosParaUnaPeliculaYLosAsientosOcupadosDeLaSalaAumentan(){
        Sala salaPelicula = new Sala(30, 1, "2D");
        Pelicula peliculaTest = new Pelicula("Scott Pilgrim vs The World", "Comedia", "+13", "", salaPelicula, carteleraTest );
        Usuario usuarioTest = new Usuario("xD", 123456, "xd@gmail.com");
        usuarioTest.generarReserva(3, peliculaTest);
        assertEquals(salaPelicula.getAsientosOcupados(), 3);

    }

}
