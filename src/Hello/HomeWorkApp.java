package Hello;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 2;
        int b = 3;
        System.out.println(a + b >= 0? "сумма положительная" : "Сумма отрицательная");
    }

    static void printColor() {
        int value;
        value = 5;
        if (value < 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value < 101) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers() {
        int a = 6;
        int b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}