package stream_grouping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageNumber {
    public static void average() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        double avg = list.stream()
                .collect(Collectors.averagingInt(n -> n));
        System.out.println(avg);
    }


}
