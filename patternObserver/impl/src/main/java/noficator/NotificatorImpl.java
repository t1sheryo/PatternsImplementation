package noficator;

import java.util.ArrayList;
import java.util.List;
import observer.Observer;

public class NotificatorImpl implements Notificator {
    private final List<Observer> observers = new ArrayList<Observer>();
    private int indicator;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(this.indicator);
        }
    }

    public void setIndicator(int indicator) {
        this.indicator = indicator;
        notifyObservers();
    }

    public int getIndicator() {
        return indicator;
    }
}
