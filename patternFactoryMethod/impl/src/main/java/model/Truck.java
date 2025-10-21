package model;

public class Truck implements Transport {
    public Truck() {
        System.out.println("Truck was created!");
    }

    @Override
    public void move() {
        System.out.println("Truck move!");
    }
}
