package Crimson.Crimson_core;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Funcion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne
    private Sala sala;

    private Date horayFecha;

    public Funcion() {}

    public Funcion(Sala sala, String horayFecha)  {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy hh:mm:ss");
        String dateInString = horayFecha;
        Date date = null;
        try {
            date = sdf.parse(dateInString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.sala = sala;
        this.horayFecha = date;
    }

    public int getAsientosSala(int cantidadAsientos) throws AsientosInsuficientesException {
        return this.sala.getAsientosSala(cantidadAsientos);
    }

    public int getNumeroSala() {
        return this.sala.getNumeroSala();
    }

    public Sala getSala() {
        return this.sala;
    }

    public Date getDate() {return this.horayFecha;}
}
