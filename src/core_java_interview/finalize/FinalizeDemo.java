package core_java_interview.finalize;

public class FinalizeDemo {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() called...");
    }

    public static void main(String[] args) {
        FinalizeDemo fd = new FinalizeDemo();
        fd = null;
        System.gc();
    }
}
