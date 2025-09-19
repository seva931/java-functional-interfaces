package stream_basics;

public class MainStreamApiBasic {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        FilterStrings stringFiltering = new FilterStrings();
        stringFiltering.printSpisok();

        System.out.println("Задача 2");
        FilterNumbers filteringNumbers = new FilterNumbers();
        filteringNumbers.printNumber();

        System.out.println("Задача 3");
        StringsToLengths transformationString = new StringsToLengths();
        transformationString.transformation();

        System.out.println("Задача 4");
        SquaresNumbers squaresNumbers = new SquaresNumbers();
        squaresNumbers.squares();

        System.out.println("Задача 5");
        RemovingDuplicates removingDuplicates = new RemovingDuplicates();
        removingDuplicates.element();
    }
}
