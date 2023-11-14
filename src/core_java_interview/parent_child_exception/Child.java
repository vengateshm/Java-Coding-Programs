package core_java_interview.parent_child_exception;

public class Child extends Parent {
    @Override
    void m1() {
        try {
            // Handle the exception
            super.m1();
        } catch (Exception e) {
            // Handle the exception or propagate it
            System.out.println("Exception handled in Child class");
        }
    }

    // Can declare the same exception, a subtype, or no exception
    @Override
    void doSomething() throws NullPointerException {
        // ...
    }
}
