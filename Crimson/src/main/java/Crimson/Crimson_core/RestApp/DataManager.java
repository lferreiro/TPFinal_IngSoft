package Crimson.Crimson_core.RestApp;

import Crimson.Crimson_core.Cartelera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataManager {

    @Autowired
    private Cartelera cartelera;

    public DataManager() {}

//    public DataManager(Cartelera cartelera) {
//        this.cartelera = cartelera;
//    }

}
