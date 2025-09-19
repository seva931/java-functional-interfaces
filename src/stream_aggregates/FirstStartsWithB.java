package stream_aggregates;

import java.util.ArrayList;
import java.util.List;

public class FirstStartsWithB {
    public static void listB() {
        List<String> list = new ArrayList<>();
        list.add("Банан");
        list.add("Яблоко");
        list.add("Петя");
        list.add("Брусника");

        String result = list.stream()
                .filter(s -> s.startsWith("Б"))
                .findFirst()
                .orElse("Не найден");

        System.out.println(result);

    }
}
