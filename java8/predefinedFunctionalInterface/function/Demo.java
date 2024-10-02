package java8.predefinedFunctionalInterface.function;

import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {
        Function<String,Integer> fn = s -> s.length();

        System.out.println(fn.apply("Khan"));
    }
}
