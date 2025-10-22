package CarSampleImpl.Object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String brand;
    private String model;
    private String color;
    private int year;
    private int horsePower;
    private int maxSpeed;
    public boolean objectIsValid(){
        return (brand != null && !brand.trim().isEmpty()
                && color != null && !color.trim().isEmpty()
                && model != null && !model.trim().isEmpty()
                && year > 0
                && horsePower > 0
                && maxSpeed > 0);
    }

    @Override
    public String toString() {
        // StringBuilder class also uses Builder Design Pattern with implementation of java.lang.Appendable interface
        StringBuilder builder = new StringBuilder();
        builder.append("Brand: ").append(brand).append("\n")
                .append("Model: ").append(model).append("\n")
                .append("Color: ").append(color).append("\n")
                .append("Year: ").append(year).append("\n")
                .append("HorsePower: ").append(horsePower).append("\n")
                .append("MaxSpeed: ").append(maxSpeed).append("\n");
        return builder.toString();
    }
}
