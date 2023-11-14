package stackOverflowError;

public class StackOverFlowErrorDemo {
    private static int counter = 1;

    private static void print() {
        if (counter <= 100000) {
            System.out.println(counter);
            counter = counter + 1;
            print();
        }
    }

    public static void main(String[] args) {
        print();
        System.out.println("Done printing...");
    }
}
