package stream_grouping;

public class MainGrouping {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        GroupByFirstLetter groupByFirstLetter = new GroupByFirstLetter();
        groupByFirstLetter.listString();

        System.out.println("Задача 2");
        GroupByParity groupByParity = new GroupByParity();
        groupByParity.numbers();


        System.out.println("Задача 3");
        AverageNumber averageNumber = new AverageNumber();
        averageNumber.average();
    }
}
