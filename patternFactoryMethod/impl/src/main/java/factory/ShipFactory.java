package factory;

import model.Ship;
import model.Transport;

public class ShipFactory extends BaseFactory {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
