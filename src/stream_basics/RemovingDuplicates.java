package stream_basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingDuplicates {
    public static void element() {
        List<String> list = new ArrayList<>();
        list.add("Яблоко");
        list.add("Яблоко");
        list.add("Дерево");
        list.add("Небо");
        list.add("Стол");

        List<String> unique  = list.stream()
                .distinct()
                .collect(Collectors.toList());

        unique .forEach(System.out::println);
    }
}
