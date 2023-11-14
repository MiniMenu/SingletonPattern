public class SynchronizedSingleton {

    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {
        System.out.println("Singleton class is instantiated");
    }

    public static synchronized SynchronizedSingleton getInstance() {

        synchronized (SynchronizedSingleton.class) {
            if (instance == null) {
                instance = new SynchronizedSingleton();
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
