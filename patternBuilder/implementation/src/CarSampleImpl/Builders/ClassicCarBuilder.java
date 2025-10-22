package CarSampleImpl.Builders;

import CarSampleImpl.Object.Car;

public class ClassicCarBuilder implements CarBuilder {
    private String model;
    private String color;
    private String brand;
    private int year;
    private int horsePower;
    private int maxSpeed;
    @Override
    public Car buildCar() {
        Car car = new Car(brand, model, color, year, horsePower, maxSpeed);
        boolean isValidCar = car.objectIsValid();

        if(isValidCar){
            return car;
        }
        else{
            System.out.println("Invalid car");
        }
        return null;
    }

    @Override
    public CarBuilder defineBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarBuilder defineModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder defineColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder defineYear(int year) {
        this.year = year;
        return this;
    }

    @Override
    public CarBuilder defineHorsepower(int horsepower) {
        this.horsePower = horsepower;
        return this;
    }

    @Override
    public CarBuilder defineMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }
}
