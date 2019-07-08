package Crimson.Crimson_core;

import Crimson.Crimson_core.Dummys.DataLoader;
import Crimson.Crimson_core.RestApp.CrimsonController;
import Crimson.Crimson_core.RestApp.DataManager;
import Crimson.Crimson_core.RestApp.Intermodelo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        CrimsonController controller = (CrimsonController) context.getBean("crimsonController");
        Cartelera cartelera = (Cartelera) context.getBean("cartelera");
        DataLoader loader = (DataLoader) context.getBean("dataLoader");
        DataManager manager = (DataManager) context.getBean("dataManager");
        Intermodelo intermodelo = (Intermodelo) context.getBean("intermodelo");

        loader.setCartelera(cartelera);
        loader.rellenar();
        manager.setCartelera(cartelera);
        intermodelo.setDataManager(manager);
        controller.setIntermodelo(intermodelo);
    }
}
