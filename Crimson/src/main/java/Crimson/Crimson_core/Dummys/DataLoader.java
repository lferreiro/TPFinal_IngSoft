package Crimson.Crimson_core.Dummys;

import Crimson.Crimson_core.Cartelera;
import Crimson.Crimson_core.Funcion;
import Crimson.Crimson_core.Pelicula;
import Crimson.Crimson_core.Sala;

import java.util.ArrayList;
import java.util.List;

public class DataLoader {

    private Cartelera cartelera;

    private Pelicula pelicula1;
    private Pelicula pelicula2;
    private Pelicula pelicula3;
    private Pelicula pelicula4;
    private Pelicula pelicula5;
    private Funcion funcion1;
    private Funcion funcion2;
    private Funcion funcion3;
    private Funcion funcion4;
    private Funcion funcion5;
    private Sala sala1;
    private Sala sala2;
    private Sala sala3;
    private Sala sala4;
    private Sala sala5;


    public DataLoader(Cartelera cartelera){

        this.cartelera = cartelera;

        sala1 = new Sala(200, 1, "2D");
        sala2 = new Sala(45, 2, "2D");
        sala3 = new Sala(50, 3, "3D");
        sala4 = new Sala (50, 4, "2D");
        sala5 = new Sala(60, 5, "3D");

        List<Funcion> listFunciones1 = new ArrayList<>();
        List<Funcion> listFunciones2 = new ArrayList<>();
        List<Funcion> listFunciones3 = new ArrayList<>();
        List<Funcion> listFunciones4 = new ArrayList<>();
        List<Funcion> listFunciones5 = new ArrayList<>();

        funcion1 = new Funcion(sala1, "10-6-19 8:00:00"); //LA FECHA ESTA EN FORMATO dd-MM-yy hh:MM-ss
        funcion2 = new Funcion(sala2, "13-6-19 8:00:00");
        funcion3 = new Funcion(sala3, "15-6-19 8:00:00");
        funcion4 = new Funcion(sala4, "17-6-19 8:00:00");
        funcion5 = new Funcion(sala5, "22-6-19 8:00:00");
        listFunciones1.add(funcion1);
        listFunciones2.add(funcion2);
        listFunciones3.add(funcion3);
        listFunciones4.add(funcion4);
        listFunciones5.add(funcion5);

        /*pelicula1 = new Pelicula("Aladdin", "Aventura Romantica", "ATP", listFunciones1, cartelera, "Aladdin (Mena Massoud) es un adorable pero desafortunado ladronzuelo enamorado de la hija del Sultán, la princesa Jasmine (Naomi Scott). Para intentar conquistarla, acepta el desafío de Jafar (Marwan Kenzari), que consiste en entrar a una cueva en mitad del desierto para dar con una lámpara mágica que le concederá todos sus deseos. Allí es donde Aladdín conocerá al Genio (Will Smith), dando inicio a una aventura como nunca antes había imaginado");
        pelicula2 = new Pelicula("Detective Pikachu", "Aventura", "ATP" , listFunciones2, cartelera, "Cuando el gran detective privado Harry Goodman desaparece misteriosamente; Tim, su hijo de 21 años, debe averiguar qué sucedió. En la investigación lo ayuda el antiguo compañero Pokémon de Harry, el Detective Pikachu: un super detective adorable y ocurrente que se asombra incluso a sí mismo. Tim y Pikachu se dan cuenta que increíblemente pueden comunicarse, y unen fuerzas en una aventura para develar el misterio enmarañado. Mientras buscan pistas en las calles resplandecientes de Ryme City, una vasta metrópolis moderna donde los humanos y los Pokémon comparten un mundo real hiperrealista, encuentran distintos personajes Pokémon y descubren un complot impactante que podría destruir la convivencia pacífica y amenazar a todo el universo Pokémon.");
        pelicula3 = new Pelicula("Avengers Endgame", "Accion", "+13", listFunciones3,cartelera, "Después de los eventos devastadores de 'Avengers: Infinity War', el universo está en ruinas debido a las acciones de Thanos, el Titán Loco. Con la ayuda de los aliados que quedaron, los Vengadores deberán reunirse una vez más para intentar deshacer sus acciones y restaurar el orden en el universo de una vez por todas, sin importar cuáles son las consecuencias... Cuarta y última entrega de la saga Vengadores");
        pelicula4 = new Pelicula("John Wick 3", "Accion", "+16", listFunciones4, cartelera, "John Wick (Keanu Reeves) regresa a la acción, solo que esta vez con una recompensa de 14 millones de dólares sobre su cabeza y con un ejército de mercenarios intentando darle caza. Tras asesinar a uno de los miembros del gremio de asesinos al que pertenecía, Wick es expulsado de la organización, pasando a convertirse en el centro de atención de multitud de asesinos a sueldo que esperan detrás de cada esquina para tratar de deshacerse de él. ");
        pelicula5 = new Pelicula("Godzilla 2", "Ciencia Ficcion", "+13", listFunciones5, cartelera, "Godzilla: Rey de los Monstruos sigue los heroícos esfuerzos de los criptozoólogos de la agencia Monarch mientras tratan de enfrentrarse contra un grupo de enormes monstruos, incluyendo el propio Godzilla. Entre todos intentan resistir a las embestidas de Mothra, Rodan o del último némesis de la humanidad: King Ghidorah. Estas ancianas criaturas harán todo lo posible por sobrevivir, poniendo en riesgo la existencia del ser humano en el planeta.");
*/
        pelicula1 = new Pelicula("Aladdin", "Aventura Romantica", "ATP", listFunciones1, cartelera, "Aladdin (Mena Massoud) es un adorable pero desafortunado ladronzuelo enamorado de la hija del Sultán");
        pelicula2 = new Pelicula("Detective Pikachu", "Aventura", "ATP" , listFunciones2, cartelera, "Cuando el gran detective privado Harry Goodman desaparece misteriosamente; Tim, su hijo de 21 años.");
        pelicula3 = new Pelicula("Avengers Endgame", "Accion", "+13", listFunciones3,cartelera, "Después de los eventos devastadores de 'Avengers: Infinity War', el universo está en ruinas debido a las acciones de Thanos.");
        pelicula4 = new Pelicula("John Wick 3", "Accion", "+16", listFunciones4, cartelera, "John Wick (Keanu Reeves) regresa a la acción, solo que esta vez con una recompensa de 14 millones de dólares sobre su cabeza.");
        pelicula5 = new Pelicula("Godzilla 2", "Ciencia Ficcion", "+13", listFunciones5, cartelera, "Godzilla: Rey de los Monstruos sigue los heroícos esfuerzos de los criptozoólogos de la agencia Monarch.");


        cartelera.agregarPelicula(pelicula1);
        cartelera.agregarPelicula(pelicula2);
        cartelera.agregarPelicula(pelicula3);
        cartelera.agregarPelicula(pelicula4);
        cartelera.agregarPelicula(pelicula5);

    }

    public Cartelera getCartelera() {
        return cartelera;
    }


    public Pelicula getPelicula1() {
        return pelicula1;
    }


    public Pelicula getPelicula2() {
        return pelicula2;
    }


    public Pelicula getPelicula3() {
        return pelicula3;
    }



    public Pelicula getPelicula4() {
        return pelicula4;
    }


    public Pelicula getPelicula5() {
        return pelicula5;
    }

    public Funcion getFuncion1() {
        return funcion1;
    }

    public Funcion getFuncion2() {
        return funcion2;
    }

    public Funcion getFuncion3() {
        return funcion3;
    }

    public Funcion getFuncion4() {
        return funcion4;
    }

    public Funcion getFuncion5() {
        return funcion5;
    }

    public Sala getSala1() {
        return sala1;
    }

    public Sala getSala2() {
        return sala2;
    }

    public Sala getSala3() {
        return sala3;
    }

    public Sala getSala4() {
        return sala4;
    }

    public Sala getSala5() {
        return sala5;
    }
}
