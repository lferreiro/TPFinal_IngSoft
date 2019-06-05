package Ingenieria_de_Software.TPFinal.Dummys;

import Ingenieria_de_Software.TPFinal.Cartelera;
import Ingenieria_de_Software.TPFinal.Pelicula;
import Ingenieria_de_Software.TPFinal.Sala;

import java.util.ArrayList;

public class DataLoader {

    public void crearSetDeDatos(Cartelera cartelera){
        Sala sala1 = new Sala(200, 1, "2D");
        Sala sala2 = new Sala(45, 2, "2D");
        Sala sala3 = new Sala(50, 3, "3D");
        Sala sala4 = new Sala (50, 4, "2D");
        Sala sala5 = new Sala(60, 5, "3D");
        Pelicula pelicula1 = new Pelicula("Aladdin", "Aventura Romantica", "ATP", "Aladdin (Mena Massoud) es un adorable pero desafortunado ladronzuelo enamorado de la hija del Sultán, la princesa Jasmine (Naomi Scott). Para intentar conquistarla, acepta el desafío de Jafar (Marwan Kenzari), que consiste en entrar a una cueva en mitad del desierto para dar con una lámpara mágica que le concederá todos sus deseos. Allí es donde Aladdín conocerá al Genio (Will Smith), dando inicio a una aventura como nunca antes había imaginado",sala1);
        Pelicula pelicula2 = new Pelicula("Detective Pikachu", "Aventura", "ATP", "Cuando el gran detective privado Harry Goodman desaparece misteriosamente; Tim, su hijo de 21 años, debe averiguar qué sucedió. En la investigación lo ayuda el antiguo compañero Pokémon de Harry, el Detective Pikachu: un super detective adorable y ocurrente que se asombra incluso a sí mismo. Tim y Pikachu se dan cuenta que increíblemente pueden comunicarse, y unen fuerzas en una aventura para develar el misterio enmarañado. Mientras buscan pistas en las calles resplandecientes de Ryme City, una vasta metrópolis moderna donde los humanos y los Pokémon comparten un mundo real hiperrealista, encuentran distintos personajes Pokémon y descubren un complot impactante que podría destruir la convivencia pacífica y amenazar a todo el universo Pokémon.",sala2);
        Pelicula pelicula3 = new Pelicula("Avengers Endgame", "Accion", "+13", "Después de los eventos devastadores de 'Avengers: Infinity War', el universo está en ruinas debido a las acciones de Thanos, el Titán Loco. Con la ayuda de los aliados que quedaron, los Vengadores deberán reunirse una vez más para intentar deshacer sus acciones y restaurar el orden en el universo de una vez por todas, sin importar cuáles son las consecuencias... Cuarta y última entrega de la saga Vengadores" ,sala3);
        Pelicula pelicula4 = new Pelicula("John Wick 3", "Accion", "+16", "John Wick (Keanu Reeves) regresa a la acción, solo que esta vez con una recompensa de 14 millones de dólares sobre su cabeza y con un ejército de mercenarios intentando darle caza. Tras asesinar a uno de los miembros del gremio de asesinos al que pertenecía, Wick es expulsado de la organización, pasando a convertirse en el centro de atención de multitud de asesinos a sueldo que esperan detrás de cada esquina para tratar de deshacerse de él. ",sala4);
        Pelicula pelicula5 = new Pelicula("Godzilla 2", "Ciencia Ficcion", "+13", "Godzilla: Rey de los Monstruos sigue los heroícos esfuerzos de los criptozoólogos de la agencia Monarch mientras tratan de enfrentrarse contra un grupo de enormes monstruos, incluyendo el propio Godzilla. Entre todos intentan resistir a las embestidas de Mothra, Rodan o del último némesis de la humanidad: King Ghidorah. Estas ancianas criaturas harán todo lo posible por sobrevivir, poniendo en riesgo la existencia del ser humano en el planeta.", sala5);

        cartelera.agregarPelicula(pelicula1);
        cartelera.agregarPelicula(pelicula2);
        cartelera.agregarPelicula(pelicula3);
        cartelera.agregarPelicula(pelicula4);
        cartelera.agregarPelicula(pelicula5);

    }
}
