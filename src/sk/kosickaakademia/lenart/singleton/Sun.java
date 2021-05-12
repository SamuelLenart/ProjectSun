package sk.kosickaakademia.lenart.singleton;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public ArrayList<Planet> findByPattern(){
        String regex="^.*Mer.*$";
        Pattern p = Pattern.compile(regex);
        for (Planet plannet:set) {
            Matcher m=p.matcher(plannet.getName());
            if (m.matches()) {
                System.out.println(plannet.getName());

            }
        }
        return (ArrayList<Planet>) set;
    }

    public void smallestDistance() {
        int temp, size;
        int array[] = {1499600000, 227900000, Math.toIntExact(2871000000000l), Math.toIntExact(1434000000000l), 778500000, Math.toIntExact(4495000000000l), 108200000};
        size = array.length;

        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Smallest distance of the planets is: "+array[0]);
    }

    /*Planet pom = set.get(0);
        for(Planet t = set)
            if (pom.getD()>t.getD())
                pom=t;
                pom.getName();
     */
}

