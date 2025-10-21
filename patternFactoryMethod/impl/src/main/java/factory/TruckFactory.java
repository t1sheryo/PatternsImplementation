package factory;

import model.Transport;
import model.Truck;

public class TruckFactory extends BaseFactory {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
