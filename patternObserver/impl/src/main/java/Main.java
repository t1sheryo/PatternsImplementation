import noficator.NotificatorImpl;
import observer.Observer;
import observer.ObserverImpl;

public class Main {
    public static void main(String[] args) {
        Observer o1 = new ObserverImpl();
        Observer o2 = new ObserverImpl();

        NotificatorImpl notificator = new NotificatorImpl();
        notificator.registerObserver(o1);
        notificator.registerObserver(o2);

        // first notification
        notificator.setIndicator(10);
        System.out.println();

        // second notification
        notificator.setIndicator(20);
    }
}
