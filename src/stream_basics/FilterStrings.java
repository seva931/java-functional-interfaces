package stream_basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStrings {
    public static void printSpisok() {
        List<String> list = new ArrayList<>();
        list.add("Яблоко");
        list.add("Стоп");
        list.add("Дерево");
        list.add("Стол");

        List<String> filtered = list.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());

        filtered.forEach(s-> System.out.println(s));
    }
}