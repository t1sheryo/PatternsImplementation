import factory.BaseFactory;
import factory.ShipFactory;
import factory.TruckFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BaseFactory factory = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("Print your case:\n1) Ship;\n2) Truck;");

        // creating an instance of correspond factory
        switch (sc.nextLine().toLowerCase()) {
            case "ship":
                factory = new ShipFactory();
                break;
            case "truck":
                factory = new TruckFactory();
                break;
        }

        assert factory != null;

        // run logic
        factory.doLogic();
    }
}
