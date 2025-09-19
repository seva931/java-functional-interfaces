package stream_basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SquaresNumbers {
    public static void squares() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(7);
        list.add(11);

        List<Integer> newList = list.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        newList.forEach(n -> System.out.println(n));
    }
}
