package CarSampleImpl.Builders;

import CarSampleImpl.Object.Car;

public interface CarBuilder {
    public Car buildCar();

    public CarBuilder defineBrand(String brand);
    public CarBuilder defineModel(String model);
    public CarBuilder defineColor(String color);
    public CarBuilder defineYear(int year);
    public CarBuilder defineHorsepower(int horsepower);
    public CarBuilder defineMaxSpeed(int maxSpeed);
}
