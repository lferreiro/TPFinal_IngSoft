package Crimson.Crimson_core.backend;

import Crimson.Crimson_core.*;
import Crimson.Crimson_core.backend.dao.impl.HibernateGenericDAO;
import Crimson.Crimson_core.backend.dao.impl.ReservaDAO;
import Crimson.Crimson_core.backend.dao.impl.UsuarioDAO;
import Crimson.Crimson_core.backend.service.TransactionRunner;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class HibernateTest {
    private UsuarioDAO usuarioDAO;
    private ReservaDAO reservaDAO;
    private Sala sala;
    private Usuario usuario1;
    private Usuario usuario2;
    private Pelicula pelicula;
    private Cartelera cartelera;

    @Before
    public void setUp() throws Exception {
        usuarioDAO = new UsuarioDAO();
        reservaDAO = new ReservaDAO();
        sala = new Sala(30, 1, "2D");
        cartelera = new Cartelera();
        usuario1 = new Usuario("Miguel", 2566464, "Miguel@gmail.com");
        usuario2 = new Usuario("Juan", 45678, "juan@gmail.com");
        pelicula = new Pelicula("Scott Pilgrim vs The World", "Comedia", "+13", "", sala, cartelera );
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
            usuario2.generarReserva(5, pelicula);
            usuarioDAO.add(usuario2);

            Reserva reservaGet = reservaDAO.get(1L);

            assertEquals(usuario2.getReservas().get(0), reservaGet);

            return null;
        });
    }
}
