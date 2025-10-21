package noficator;

import observer.Observer;

public interface Notificator {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
