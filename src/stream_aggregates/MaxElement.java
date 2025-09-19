package stream_aggregates;

import java.util.ArrayList;
import java.util.List;

public class MaxElement {
    public static void maxNumbers() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        list.add(500);
        list.add(1010);

        int max = list.stream()
                .max(Integer::compare)
                .orElseThrow();

        System.out.println(max);
    }
}
