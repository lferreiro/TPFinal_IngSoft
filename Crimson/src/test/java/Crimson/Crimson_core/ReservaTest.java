package Crimson.Crimson_core;

import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class ReservaTest {
    private Sala sala;
    private Funcion funcion;
    private Reserva reserva;
    private Date dateTime;
    private SimpleDateFormat formatter;
    private Gson gson;

    @Before
    public void setup() {
        sala = new Sala(4, 7, "3D");
        funcion = new Funcion(sala, "2019-07-08 22:15:00");
        reserva = new Reserva(2, 123456, "miguel@gmail.com", "Endgame", funcion);
        formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        gson = new Gson();
    }

    @Test
    public void sePasaLaReservaAJson() throws Exception {
        String compare = "{\"id\":0,\"date\":\"Jul 10, 2019 10:15:00 PM\",\"asientos\":2,\"dniUsuario\":123456,\"numeroSala\":7,\"emailReserva\":\"miguel@gmail.com\",\"nombrePelicula\":\"Endgame\",\"funcionReservada\":{\"id\":0,\"sala\":{\"numeroSala\":7,\"cantidadAsientos\":4,\"asientosOcupados\":0,\"tipoSala\":\"3D\"},\"horayFecha\":\"Jan 9, 2014 10:15:00 PM\"}}";
        dateTime = formatter.parse("2019-07-10 22:15:00");
        reserva.setDate(dateTime);
        String json = gson.toJson(reserva);

        assertEquals(compare, json);
    }
}
