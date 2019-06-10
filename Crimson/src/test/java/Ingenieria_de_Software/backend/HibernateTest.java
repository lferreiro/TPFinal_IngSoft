package Ingenieria_de_Software.backend;

import Ingenieria_de_Software.TPFinal.Asiento;
import Ingenieria_de_Software.TPFinal.Sala;
import Ingenieria_de_Software.TPFinal.Usuario;
import Ingenieria_de_Software.backend.dao.impl.HibernateGenericDAO;
import Ingenieria_de_Software.backend.service.TransactionRunner;
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
