package stream_aggregates;

import java.util.ArrayList;
import java.util.List;

public class AnyMatchExample {
    public static void anyNumber() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        list.add(500);
        list.add(1010);

        boolean hasEven  = list.stream()
                .allMatch(n -> n % 2 == 0);
        System.out.println(hasEven);
    }
}

