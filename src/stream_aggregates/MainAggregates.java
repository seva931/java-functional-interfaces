package stream_aggregates;

public class MainAggregates {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        MaxElement maxElement = new MaxElement();
        maxElement.maxNumbers();

        System.out.println("Задача 2");
        MinElement minElement = new MinElement();
        minElement.minNumbers();

        System.out.println("Задача 3");
        SumElement sumElement = new SumElement();
        sumElement.sumNumbers();

        System.out.println("Задача 4");
        FirstStartsWithB firstStartsWithB = new FirstStartsWithB();
        firstStartsWithB.listB();

        System.out.println("Задача 5");
        AnyMatchExample anyMatchExample = new AnyMatchExample();
        anyMatchExample.anyNumber();
    }
}
