package Crimson.Crimson_core.JSON_Holders;

public class HPelicula {

    private final String        nombre;
    private final String        genero;
    private final String        clasificacion;
    private final String        sinopsis;
    private final HSala         sala;

    public HPelicula(String nombre, String genero, String clasificacion, String sinopsis, HSala sala) {
        this.nombre = nombre;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.sinopsis = sinopsis;
        this.sala = sala;
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
}
