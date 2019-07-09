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
    private Funcion funcion6;
    private Funcion funcion7;
    private Funcion funcion8;
    private Funcion funcion9;
    private Funcion funcion10;
    private Funcion funcion11;
    private Funcion funcion12;
    private Funcion funcion13;
    private Funcion funcion14;
    private Funcion funcion15;
    private Funcion funcion16;
    private Funcion funcion17;
    private Funcion funcion18;
    private Funcion funcion19;
    private Funcion funcion20;
    private Funcion funcion21;
    private Funcion funcion22;
    private Funcion funcion23;
    private Funcion funcion24;
    private Funcion funcion25;

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
        funcion2 = new Funcion(sala1, "10-6-19 12:00:00");
        funcion3 = new Funcion(sala1, "10-6-19 16:00:00");
        funcion4 = new Funcion(sala1, "10-6-19 20:00:00");
        funcion5 = new Funcion(sala1, "11-6-19 0:00:00");
        funcion6 = new Funcion(sala2, "13-6-19 8:00:00");
        funcion7 = new Funcion(sala2, "13-6-19 13:00:00");
        funcion8 = new Funcion(sala2, "13-6-19 16:00:00");
        funcion9 = new Funcion(sala2, "13-6-19 19:00:00");
        funcion10 = new Funcion(sala2, "13-6-19 22:00:00");
        funcion11 = new Funcion(sala3, "15-6-19 13:30:00");
        funcion12 = new Funcion(sala3, "15-6-19 17:00:00");
        funcion13 = new Funcion(sala3, "15-6-19 20:30:00");
        funcion14 = new Funcion(sala3, "15-6-19 23:00:00");
        funcion15 = new Funcion(sala3, "15-6-19 8:00:00");
        funcion16 = new Funcion(sala4, "17-6-19 8:00:00");
        funcion17 = new Funcion(sala4, "17-6-19 8:00:00");
        funcion18 = new Funcion(sala4, "17-6-19 8:00:00");
        funcion19 = new Funcion(sala4, "17-6-19 8:00:00");
        funcion20 = new Funcion(sala4, "17-6-19 8:00:00");
        funcion21 = new Funcion(sala5, "22-6-19 8:00:00");
        funcion22 = new Funcion(sala5, "22-6-19 15:00:00");
        funcion23 = new Funcion(sala5, "22-6-19 22:00:00");
        funcion24 = new Funcion(sala5, "23-6-19 8:00:00");
        funcion25 = new Funcion(sala5, "23-6-19 15:00:00");



        listFunciones1.add(funcion1);
        listFunciones1.add(funcion2);
        listFunciones1.add(funcion3);
        listFunciones1.add(funcion4);
        listFunciones1.add(funcion5);
        listFunciones2.add(funcion6);
        listFunciones2.add(funcion7);
        listFunciones2.add(funcion8);
        listFunciones2.add(funcion9);
        listFunciones2.add(funcion10);
        listFunciones3.add(funcion11);
        listFunciones3.add(funcion12);
        listFunciones3.add(funcion13);
        listFunciones3.add(funcion14);
        listFunciones3.add(funcion15);
        listFunciones4.add(funcion16);
        listFunciones4.add(funcion17);
        listFunciones4.add(funcion18);
        listFunciones4.add(funcion19);
        listFunciones4.add(funcion20);
        listFunciones5.add(funcion21);
        listFunciones5.add(funcion22);
        listFunciones5.add(funcion23);
        listFunciones5.add(funcion24);
        listFunciones5.add(funcion25);

        String trailerAladin = "https://www.youtube.com/watch?v=P4hFcYjRl5w";
        String imagenAladin = "http://www.impawards.com/2019/posters/aladdin_ver2_xlg.jpg";
        String trailerDetectivePikachu = "https://www.youtube.com/watch?v=1roy4o4tqQM";
        String imagenDetectivePikachu = "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/detective-pikachu-posters-pokemon-1555077586.jpg?resize=768:*";
        String trailerAvengersEndgame = "https://www.youtube.com/watch?v=TcMBFSGVi1c";
        String imagenAvengersEndgame = "https://pbs.twimg.com/media/D1nmVNuU4AAO2yD.jpg";
        String trailerJohnWick3 = "https://www.youtube.com/watch?v=pU8-7BX9uxs";
        String imagenJohnWick3 = "https://i.pinimg.com/474x/ff/29/85/ff2985822be20fc27bf90dc21887bf0a.jpg";
        String trailerGodzilla = "https://www.youtube.com/watch?v=oI8KeDWpgiY";
        String imagenGodzilla = "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/godzilla-2-poster-1544433582.jpg?crop=1xw:1xh;center,top&resize=768:*";



        pelicula1 = new Pelicula("Aladdin", "Aventura Romantica", "ATP", listFunciones1, cartelera, trailerAladin,imagenAladin,"Aladdin (Mena Massoud) es un adorable pero desafortunado ladronzuelo enamorado de la hija del Sultán");
        pelicula2 = new Pelicula("Detective Pikachu", "Aventura", "ATP" , listFunciones2, cartelera, trailerDetectivePikachu,imagenDetectivePikachu ,"Cuando el gran detective privado Harry Goodman desaparece misteriosamente; Tim, su hijo de 21 años.");
        pelicula3 = new Pelicula("Avengers Endgame", "Accion", "+13", listFunciones3,cartelera, trailerAvengersEndgame, imagenAvengersEndgame,"Después de los eventos devastadores de 'Avengers: Infinity War', el universo está en ruinas debido a las acciones de Thanos.");
        pelicula4 = new Pelicula("John Wick 3", "Accion", "+16", listFunciones4, cartelera, trailerJohnWick3, imagenJohnWick3,"John Wick (Keanu Reeves) regresa a la acción, solo que esta vez con una recompensa de 14 millones de dólares sobre su cabeza.");
        pelicula5 = new Pelicula("Godzilla 2", "Ciencia Ficcion", "+13", listFunciones5, cartelera, trailerGodzilla , imagenGodzilla ,"Godzilla: Rey de los Monstruos sigue los heroícos esfuerzos de los criptozoólogos de la agencia Monarch.");


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
