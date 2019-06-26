package Crimson.Crimson_core.backend;


import Crimson.Crimson_core.*;
import Crimson.Crimson_core.backend.dao.impl.HibernateGenericDAO;
import Crimson.Crimson_core.backend.service.TransactionRunner;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class HibernateTest {
    private HibernateGenericDAO hibernateDAO;
    private Sala sala;
    private Usuario usuario1;
    private Usuario usuario2;
    private Pelicula pelicula;
    private Cartelera cartelera;

    @Before
    public void setUp() throws Exception {
        sala = new Sala(30, 1, "2D");
        cartelera = new Cartelera();
        usuario1 = new Usuario("Miguel", 2566464, "Miguel@gmail.com");
        usuario2 = new Usuario("Juan", 45678, "juan@gmail.com");
        pelicula = new Pelicula("Scott Pilgrim vs The World", "Comedia", "+13", "", sala, cartelera );
    }

    @Test
    public void recuperarUsuario() {
        hibernateDAO  = new HibernateGenericDAO(Usuario.class);

        TransactionRunner.runInSession(() -> {
            hibernateDAO.add(usuario1);

            Usuario usuarioGet = (Usuario) hibernateDAO.get(2566464);

            assertEquals(usuario1.getDni(), usuarioGet.getDni());

            return null;
        });

    }

    @Test
    public void recuperarReserva() {
        hibernateDAO = new HibernateGenericDAO(Usuario.class);
        HibernateGenericDAO hibernateReservaDao = new HibernateGenericDAO(Reserva.class);


        TransactionRunner.runInSession(() -> {
            try {
                usuario2.generarReserva(5, pelicula);
            } catch (AsientosInsuficientesException e) {
                e.printStackTrace();
            }
            hibernateDAO.add(usuario2);

            Reserva reservaGet = (Reserva) hibernateReservaDao.get(1L);

            assertEquals(usuario2.getReservas().get(0), reservaGet);

            return null;
        });
    }
}
