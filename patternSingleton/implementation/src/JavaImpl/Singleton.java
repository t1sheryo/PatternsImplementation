package JavaImpl;

//This is one of the ways of implementing Singleton
//Design Pattern in java. It is specific to java language.
//Some concepts to understand before implementing singleton
//design by using this way in java:
//Classes are loaded only one time in memory by JDK.
//Inner classes in java are loaded in memory by JDK when
//it comes into scope of usage. It means that if we are not performing any action
//with inner class in our codebase, JDK will not load
//that inner class into memory.
//It is loaded only when this is being used somewhere.
//In this code, we are having a private static inner class SingletonInner
//and having private field. Through, getInstance() method of singleton class,
//we will access the field of inner class, and due to being inner class,
//it will be loaded only one time at the time of accessing the INSTANCE field first time.
//And the INSTANCE is a static member due to which it will be initialized only once.

public class Singleton {
    private Singleton(){
        System.out.println("Instance is created!\n");
    }

    public static class InnerSingleton{
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return InnerSingleton.instance;
    }

    public static void makeAction(){
        System.out.println("Making action!\n");
    }
}
