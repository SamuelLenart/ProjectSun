package sk.kosickaakademia.lenart.singleton;

import java.util.ArrayList;
import java.util.List;

public class Sun {
    private static Sun instance = new Sun();
    Planet planet;
    List<Planet> planets = new ArrayList<>();
    private Sun() {

    }
    public static Sun getInstance(){
        System.out.println("Planet added");
        return instance;
    }
}
