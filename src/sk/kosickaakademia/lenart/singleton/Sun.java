package sk.kosickaakademia.lenart.singleton;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sun {
    private static Sun instance = new Sun();

    private Set<Planet> set;

    private Sun() {
        set=new HashSet<>();
    }
    public static Sun getInstance(){

        return instance;
    }
    public void addPlanet(Planet planet){
        set.add(planet);
    }

    public void printAllPlanets(){
        for(Planet planet : set){
            System.out.println(planet.getName());
        }
    }
}
