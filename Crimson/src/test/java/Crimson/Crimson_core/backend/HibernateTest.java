package Crimson.Crimson_core.backend;

import Crimson.Crimson_core.*;
import Crimson.Crimson_core.backend.dao.impl.ReservaDAO;
import Crimson.Crimson_core.backend.dao.impl.UsuarioDAO;
import Crimson.Crimson_core.backend.service.TransactionRunner;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class HibernateTest {
    private Sala sala;
    private UsuarioDAO usuarioDAO;
    private ReservaDAO reservaDAO;
    private Sala sala1;
    private Sala sala2;
    private Usuario usuario1;
    private Usuario usuario2;
    private Pelicula pelicula1;
    private Pelicula pelicula2;
    private Cartelera cartelera;
    private Funcion funcion1;
    private Funcion funcion2;

    @Before
    public void setUp() throws Exception {
        List<Funcion> funciones1 = new ArrayList<>();
        List<Funcion> funciones2 = new ArrayList<>();
        usuarioDAO = new UsuarioDAO();
        reservaDAO = new ReservaDAO();
        sala1 = new Sala(30, 1, "2D");
        sala2 = new Sala(20, 2, "3D");
        funcion1 = new Funcion(sala1, "10-6-19 8:00:00");
        funcion1 = new Funcion(sala2, "15-6-19 15:00:00");
        funciones1.add(funcion1);
        funciones2.add(funcion2);
        cartelera = new Cartelera();
        usuario1 = new Usuario("Miguel", 2566464, "Miguel@gmail.com");
        usuario2 = new Usuario("Juan", 45678, "juan@gmail.com");
        pelicula1 = new Pelicula("Scott Pilgrim vs The World", "Comedia", "+13", funciones1, cartelera, "", "","");
        pelicula2 = new Pelicula("Scott Pilgrim vs The World", "Comedia", "+13", funciones2,  cartelera, "","","" );

    }

    @Test
    public void recuperarUsuario() {
        TransactionRunner.runInSession(() -> {
            usuarioDAO.add(usuario1);

            Usuario usuarioGet = usuarioDAO.get(2566464);

            assertEquals(usuario1.getDni(), usuarioGet.getDni());

            return null;
        });

    }

    @Test
    public void recuperarReserva() {
        TransactionRunner.runInSession(() -> {

            try {
                usuario2.generarReserva(5, pelicula1, funcion1, "");
                usuario2.generarReserva(2, pelicula1,funcion1, "");
            } catch (AsientosInsuficientesException e) {
                e.printStackTrace();
            }
            usuarioDAO.add(usuario2);

            long reservaId = usuario2.getReservas().get(0).getId();

            Reserva reservaGet = reservaDAO.get(reservaId);

            assertEquals(usuario2.getReservas().get(0), reservaGet);

            return null;
        });
    }

}
