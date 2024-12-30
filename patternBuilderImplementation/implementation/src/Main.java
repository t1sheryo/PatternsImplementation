import CarSampleImpl.Builders.ClassicCarBuilder;
import CarSampleImpl.Builders.CarBuilder;
import CarSampleImpl.Object.Car;

public class Main {
    public static void main(String[] args) {

        ClassicCarBuilder carBuilder = new ClassicCarBuilder();
        Car car = carBuilder.defineBrand("Mazda")
                .defineColor("Metallic")
                .defineModel("626")
                .defineHorsepower(110)
                .defineYear(1999)
                .defineMaxSpeed(240)
                .buildCar();

        if(car != null) {
            System.out.println(car.toString());
        }
    }
}