package functional_interface;

public class MainMath {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        MathOperation add = (a, b) -> a + b;
        System.out.println("Сложение: " + add.operate(10,5));
        MathOperation subtraction = (a, b) -> a - b;
        System.out.println("Вычитание: " + add.operate(210,55));
        MathOperation division = (a, b) -> a / b;
        System.out.println("Деление: " + add.operate(1000, 10));
        MathOperation multiplication = (a, b) -> a * b;
        System.out.println("Умножение: " + add.operate(10,10));

        System.out.println("Задача 2");
        Runnable print = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };
        print.run();
    }
}
