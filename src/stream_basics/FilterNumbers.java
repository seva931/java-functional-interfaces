package stream_basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNumbers {
    public static void printNumber() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(21);
        numbers.add(50);
        numbers.add(24);

        List<Integer> filtered  = numbers.stream()
                .filter(s -> s % 5 == 0)
                .collect(Collectors.toList());

        filtered .forEach(s -> System.out.println(s));
    }
}
