package stream_aggregates;

import java.util.ArrayList;
import java.util.List;

public class SumElement {
    public static void sumNumbers() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        list.add(500);
        list.add(1010);

        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }
}
