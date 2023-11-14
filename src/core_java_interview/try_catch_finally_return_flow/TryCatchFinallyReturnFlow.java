package core_java_interview.try_catch_finally_return_flow;

public class TryCatchFinallyReturnFlow {

    public static int m1() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    public static int m2() {
        try {
            //System.out.println(10/0);
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            System.out.println("Before exiting...");
            System.exit(0);
            return 3;
        }
    }

    public static void main(String[] args) {
        //System.out.println(m1());
        System.out.println(m2());
    }
}
