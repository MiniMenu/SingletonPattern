public class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton class is instantiated");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
