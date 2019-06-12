package Crimson.Crimson_rest.JSON_Holders;

public class HPelicula {

    private final String        nombre;
    private final String        genero;
    private final String        clasificacion;
    private final String        sinopsis;
    private final HSala         sala;
    private final HCartelera    cartelera;

    public HPelicula(String nombre, String genero, String clasificacion, String sinopsis, HSala sala, HCartelera cartelera) {
        this.nombre = nombre;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.sinopsis = sinopsis;
        this.sala = sala;
        this.cartelera = cartelera;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public HSala getSala() {
        return sala;
    }

    public HCartelera getCartelera() {
        return cartelera;
    }
}
