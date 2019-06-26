package Crimson.Crimson_core.backend;

import Crimson.Crimson_core.*;
import Crimson.Crimson_core.backend.dao.impl.ReservaDAO;
import Crimson.Crimson_core.backend.dao.impl.UsuarioDAO;
import Crimson.Crimson_core.backend.service.TransactionRunner;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class HibernateTest {
    private UsuarioDAO usuarioDAO;
    private ReservaDAO reservaDAO;
    private Sala sala1;
    private Sala sala2;
    private Usuario usuario1;
    private Usuario usuario2;
    private Pelicula pelicula1;
    private Pelicula pelicula2;
    private Cartelera cartelera;

    @Before
    public void setUp() throws Exception {
        usuarioDAO = new UsuarioDAO();
        reservaDAO = new ReservaDAO();
        sala1 = new Sala(30, 1, "2D");
        sala2 = new Sala(20, 2, "3D");
        cartelera = new Cartelera();
        usuario1 = new Usuario("Miguel", 2566464, "Miguel@gmail.com");
        usuario2 = new Usuario("Juan", 45678, "juan@gmail.com");
        pelicula1 = new Pelicula("Scott Pilgrim vs The World", "Comedia", "+13", "", sala1, cartelera );
        pelicula2 = new Pelicula("Scott Pilgrim vs The World", "Comedia", "+13", "", sala2, cartelera );
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
            usuario2.generarReserva(5, pelicula1);
            usuario2.generarReserva(2, pelicula1);
            usuarioDAO.add(usuario2);

            long reservaId = usuario2.getReservas().get(0).getId();

            Reserva reservaGet = reservaDAO.get(reservaId);

            assertEquals(usuario2.getReservas().get(0), reservaGet);

            return null;
        });
    }

}
