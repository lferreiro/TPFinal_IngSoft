package Ingenieria_de_Software.TPFinal;


public class Pelicula {

    private String nombre;
    private String genero;
    private String clasificacion;
    private String sinopsis;
    private Sala sala;

    public Pelicula(String nombreP, String generoP, String clasificacionP, String sinopsis, Sala salaP ){
        this.nombre = nombreP;
        this.genero = generoP;
        this.clasificacion = clasificacionP;
        this.sinopsis = sinopsis;
        this.sala = salaP;
    }

    public Reserva reservarAsientos(int cantidadAsientos, int dniUsuario){
        return new Reserva(this.sala.getAsientosSala(cantidadAsientos), dniUsuario ,sala.getNumeroSala());
    }

    public Sala getSala(){
        return sala;
    }


}
