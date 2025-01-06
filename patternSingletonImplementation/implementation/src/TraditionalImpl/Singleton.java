package TraditionalImpl;

public class Singleton {
    private static Singleton instance;
    private Singleton() {
        System.out.println("Singleton is successfully created!\n");
    }

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public void makeAction(){
        System.out.println("Making action!\n");
    }
}
