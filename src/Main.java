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
        task10();

     }

    public static void task1 () {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
        System.out.println(i);
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i);
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task7 () {
        System.out.println("Задача 7 ");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int salary = 29000;
        int totalCash = 0;
        for (int i = 1; i <= 12; i++) {
            totalCash = totalCash + salary;
            System.out.println("Месяц " + i + ", сумма накоплений " + totalCash + " рублей");
        }
    }

    public static void task9 () {
        System.out.println("Задача 9");
        float salary = 29000f;
        float totalCash = 0f;
        for (int i = 1; i <= 12; i++) {
            if (i == 1) {
                totalCash = totalCash + salary;
 // В первый месяц заработная плата получена, но ещё не положена в банк, поэтому проценты за 1 месяц, с 29 000 рублей, будут начислены только во 2 месяце
            } else if (i >= 2) {
                salary = (float) (salary + salary * 0.01);
                totalCash = totalCash + salary;
            }
            System.out.println("Месяц " + i + ", сумма накоплений " + totalCash + " рублей");
        }
    }

    public static void task10 () {
        System.out.println("Задача 10");
        int factor = 2;
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result = factor * i;
            System.out.println("2" + " * " + i + " = " + result);
//            System.out.printf(String.valueOf(result));
        }
    }
}

