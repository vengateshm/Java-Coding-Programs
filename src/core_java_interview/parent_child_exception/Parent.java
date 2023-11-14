package core_java_interview.parent_child_exception;

import java.io.IOException;

public class Parent {
    void m1() throws Exception {
        throw new Exception("Parent class exception from m1()");
    }

    void doSomething() throws Exception {
    }
}
