package stream_grouping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByParity {
    public static void numbers() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);

        Map<String, List<Integer>> group = list.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Четное" : "Нечетное"));
        group.forEach((a,b) -> System.out.println(a + " -> " + b));
    }

}
