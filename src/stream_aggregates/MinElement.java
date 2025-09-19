package stream_aggregates;

import java.util.ArrayList;
import java.util.List;

public class MinElement {
    public static void minNumbers() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        list.add(500);
        list.add(1010);

        int min = list.stream()
                .min(Integer::compare)
                .orElseThrow();

        System.out.println(min);
    }
}
