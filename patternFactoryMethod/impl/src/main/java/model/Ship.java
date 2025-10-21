package model;

public class Ship implements Transport {
    public Ship() {
        System.out.println("Ship was created!");
    }

    @Override
    public void move() {
        System.out.println("Ship move!");
    }
}
