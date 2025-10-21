package factory;

import model.Transport;

public abstract class BaseFactory {
    public void doLogic() {
        Transport transport = createTransport();
        transport.move();
    }

    protected abstract Transport createTransport();
}
