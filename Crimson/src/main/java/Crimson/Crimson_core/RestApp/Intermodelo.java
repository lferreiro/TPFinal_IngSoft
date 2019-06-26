package Crimson.Crimson_core.RestApp;

import Crimson.Crimson_core.JSON_Holders.HPelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Intermodelo {

    @Autowired
    private DataManager dataManager;

    public Intermodelo() {}

    public Intermodelo(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    //Prop: devuelve la cartelera del sistema en modo simplificado.
    public List<HPelicula> cartelera() {
        return null;
    }

}
