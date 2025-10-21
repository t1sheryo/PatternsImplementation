package observer;

public class ObserverImpl implements Observer {
    private static int ID = 0;
    private int id;
    private int indicator;

    public ObserverImpl() {
        this.id = this.ID++;
    }

    @Override
    public void update(int indicator) {
        this.indicator = indicator;
        System.out.println("Observer update: id: " + this.id + ", indicator: " + this.indicator);
    }
}
