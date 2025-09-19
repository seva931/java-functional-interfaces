package stream_basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringsToLengths {
    public static void transformation() {
        List<String> list = new ArrayList<>();
        list.add("Дерево");
        list.add("Петя");
        list.add("Столб");
        list.add("Небо");

        List<Integer> length = list.stream()
                .map(str -> str.length())
                .collect(Collectors.toList());

        length.forEach(str -> System.out.println(str));
    }
}
