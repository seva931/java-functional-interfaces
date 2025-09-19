package lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainLambda {
    public static void main(String[] args) {
        System.out.println("Задача 3");
        Predicate<Integer> checkNumber = (s) -> s % 2 == 0;
        System.out.println(checkNumber.test(20));

        System.out.println("Задача 4");
        Function<String, Integer> stringLength = (srt) -> srt.length();
        System.out.println(stringLength.apply("Строка"));

        System.out.println("Задача 5");
        Consumer<String> printString = (str) -> System.out.println(str);
        printString.accept("Привет мир");
    }
}
