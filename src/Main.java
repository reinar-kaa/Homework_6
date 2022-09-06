public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();

    }

    private static void task9() {           //откладываем по 12% годовых в банк
        int investmentInBank = 29_000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total/100;
            total = total + investmentInBank;
            System.out.println("Месяц " + i + " \nСумма накоплений равна в " + total + " рублей");
        }
    }

    private static void task8() {           //откладываем в банку
        int investmentInBottle = 29_000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + investmentInBottle;
            System.out.println("Месяц " + i + " \nСумма накоплений равна в " + total + " рублей");
        }
    }

    private static void task7() {
        for (int i = 1; i < 512; i = i * 2) {
            System.out.println("Последовательность чисел будет такова: " + i);
        }
    }

    private static void task6() {
        for (int i = 7; i < 98; i = i + 7) {
            System.out.println("Число " + i);
        }
    }

    private static void task5() {
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.printf("%d год является високосным\n", i);
        }
    }

    private static void task4() {
        for (int i = 10; i > -10; i--) {
            System.out.println("Цикл " + i);
        }
    }

    private static void task3() {
        for (int i = 0; i < 17; i ++) {
            System.out.println("цикл чётных значений " + i++);
        }
    }

    private static void task2() {
        for (int i = 10; i > 0; i--) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
    }
}