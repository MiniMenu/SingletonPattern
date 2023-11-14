public class LockFreeSingleton {
    private static LockFreeSingleton instance = new LockFreeSingleton();

    private LockFreeSingleton() {
        System.out.println("Singleton class is instantiated");
    }

    public static synchronized LockFreeSingleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
