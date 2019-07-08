package Crimson.Crimson_core;

import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReservaTest {
    private Reserva reserva;
    private Gson gson;

    @Before
    public void setup() {
        reserva = new Reserva();
        gson = new Gson();
    }

    @Test
    public void sePasaLaReservaAJson() {
        String compare = "{\"id\":0,\"asientos\":0,\"dniUsuario\":0,\"numeroSala\":0}";
        String json = gson.toJson(reserva);

        assertEquals(compare, json);
    }
}
