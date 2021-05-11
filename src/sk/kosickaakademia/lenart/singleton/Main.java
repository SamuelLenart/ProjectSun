package sk.kosickaakademia.lenart.singleton;

public class Main {
    public static void main(String[] args) {
        Sun sun = Sun.getInstance();
        Planet earth = new Planet("Earth", 1499600000);
        Planet mars = new Planet("Mars", 227900000);
        Planet uranus = new Planet("Uranus", 2871000000000l);
        Planet saturn = new Planet("Saturn", 1434000000000l);
        Planet jupiter = new Planet("Jupiter", 778500000);
        Planet neptune = new Planet("Neptune", 4495000000000l);
        Planet venus = new Planet("Venus", 108200000);

        sun.addPlanet(earth);
        sun.addPlanet(mars);
        sun.addPlanet(jupiter);
        sun.addPlanet(uranus);
    }
}
