package core_java_interview.string_object_literal;

public class StringObjectLiteralDemo {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = "Hello";
        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        s1.intern();
        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
