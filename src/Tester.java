public class Tester {
    public static void main(String[] args) {
//        printToConsoleWithoutSemiColon();
        Tester tester = new Tester();
        tester.test(10);
        tester.test(10L);
        tester.test((Integer) 10);
        tester.test(10, 20);
        tester.test((byte) 10);
        tester.test((short) 10);


        label:
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue label;
            }
            System.out.println("" + i);
        }
    }

    private static void printToConsoleWithoutSemiColon() {
        // Print Hello world without semi-colon
        if (System.out.printf("Hello World \n") == null) {

        }
        if (System.out.append("Hello World \n") == null) {

        }
    }

    static boolean printString() {
        System.out.println("Hola!");
        return true;
    }

    static boolean printStatus = printString();

    public void test(int i) {
        System.out.println("int");
    }

    public void test(int... i) {
        System.out.println("int...");
    }

    public void test(Integer i) {
        System.out.println("Integer");
    }

    public void test(long i) {
        System.out.println("long");
    }

    public void test(byte i) {
        System.out.println("byte");
    }

    public void test(short i) {
        System.out.println("short");
    }
}
