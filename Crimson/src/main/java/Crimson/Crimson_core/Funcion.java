package Crimson.Crimson_core;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Funcion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne (cascade=CascadeType.ALL)
    private Sala sala;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="dd-MM-yy hh:mm:ss")
    private Date horayFecha;

    private int asientosOcupados;

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
        this.asientosOcupados = 0;
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

    public boolean estaLlena(){
       return sala.getCantidadAsientos() <= asientosOcupados;
    }

    public int reservarAsientos(int cantidadAsientos) throws AsientosInsuficientesException{
        if(this.sala.getCantidadAsientos() >= asientosOcupados + cantidadAsientos) {
            asientosOcupados = asientosOcupados + cantidadAsientos;
            return cantidadAsientos;
        }
        else{
            throw new AsientosInsuficientesException("Queres reservar " + cantidadAsientos + " pero hay " + (cantidadAsientos-asientosOcupados) + " disponibles.");
        }
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Date getHorayFecha() {
        return horayFecha;
    }

    public void setHorayFecha(Date horayFecha) {
        this.horayFecha = horayFecha;
    }

    public int getAsientosOcupados() {
        return asientosOcupados;
    }

    public void setAsientosOcupados(int asientosOcupados) {
        this.asientosOcupados = asientosOcupados;
    }
}
