package stream_grouping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstLetter {
    public static void listString() {
        List<String> list = new ArrayList<>();
        list.add("Дерево");
        list.add("Дом");
        list.add("Стена");
        list.add("Слово");
        list.add("Яблоко");
        list.add("Янтарь");

        Map<Character, List<String>> group = list.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        group.forEach((a,b) -> System.out.println(a + " -> " + b));
    }
}
