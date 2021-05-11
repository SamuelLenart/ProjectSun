package sk.kosickaakademia.lenart.singleton;

public class Planet {
    private String name;
    private long distance;

    public Planet(String name, long distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public long getDistance() {
        return distance;
    }
}
