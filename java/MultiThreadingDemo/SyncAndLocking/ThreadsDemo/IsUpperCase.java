package MultiThreadingDemo.SyncAndLocking.ThreadsDemo;

import java.util.function.Predicate;

public class IsUpperCase {
    public static void main(String[] args) {
        Predicate<String> isUppercase = str -> str.equals(str.toUpperCase());

        System.out.println(isUppercase.test("HELLO"));
        System.out.println(isUppercase.test("Hello"));
    }
}
