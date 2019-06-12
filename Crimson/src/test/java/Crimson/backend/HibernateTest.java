package Crimson.backend;

import Crimson.Crimson_core.Asiento;
import Crimson.Crimson_core.Sala;
import Crimson.Crimson_core.Usuario;
import Crimson.backend.dao.impl.HibernateGenericDAO;
import Crimson.backend.service.TransactionRunner;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HibernateTest {
    private Asiento asiento;
    private HibernateGenericDAO hibernateDAO = new HibernateGenericDAO(Usuario.class);
    private Sala sala;
    private Usuario usuario;

    @Before
    public void setUp() throws Exception {
        sala = new Sala();
        asiento = new Asiento(7, sala);
        usuario = new Usuario("Miguel", 2566464, "Miguel@gmail.com");

    }

    @Test
    public void recuperarAsiento() {
        TransactionRunner.runInSession(() -> {
            hibernateDAO.add(usuario);

            Usuario asientoGet = (Usuario) hibernateDAO.get(2566464);

            assertEquals(usuario.getDni(), asientoGet.getDni());

            return null;
        });

    }
}
