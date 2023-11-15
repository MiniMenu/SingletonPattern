public class Main {
    public static void main(String[] args) {
        // System.out.println("---------------- invoke Singleton class  ----------------");
        // Singleton.getInstance().showMessage();

        System.out.println("---------------- Thread Safe Singleton ----------------");
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                LockFreeSingleton.getInstance();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                LockFreeSingleton.getInstance();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                LockFreeSingleton.getInstance();
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                LockFreeSingleton.getInstance();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
