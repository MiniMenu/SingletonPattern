
public class SynchronizedSingletonV2 {

    private static SynchronizedSingletonV2 instance;

    private SynchronizedSingletonV2() {
        System.out.println("Singleton class is instantiated");
    }

    public static synchronized SynchronizedSingletonV2 getInstance() {
 
        if (instance == null) {
            synchronized (SynchronizedSingletonV2.class) {
                if (instance == null) {
                    instance = new SynchronizedSingletonV2();
                }
            }
        }
        return instance;

    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
