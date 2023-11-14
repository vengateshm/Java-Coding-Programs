package singleton;

public class Tester {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println(Singleton.getInstance());
        });
        Thread t2 = new Thread(() -> {
            System.out.println(Singleton.getInstance());
        });
        t1.start();
        t2.start();
    }
}
