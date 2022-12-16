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
    }

    public static void task1() {
        System.out.println("Задача 1");
        int sum = 15_000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total += sum;
            month++;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int num = 0;
        while (num < 10) {
            num++;
            System.out.print(num + " ");
        }
        System.out.println();
        for (int sum = 10; sum >= 1; sum--) {
            System.out.print(sum + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int fertility = population / 1_000 * 17;
        int mortality = population / 1_000 * 8;
        int year = 0;
        while (year < 10) {
            year++;
            population = population + fertility - mortality;
            System.out.println("Год " + year + ", численность населения составляет: " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int sum = 15_000;
        int total = 0;
        double percent = 1.07;
        int month = 0;
        while (total < 12_000_000) {
            month++;
            total *= percent;
            total += sum;
            System.out.println("Месяц " + month + ", сумма накоплений: " + total + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int sum = 15_000;
        int total = 0;
        double percent = 1.07;
        int month = 0;
        while (total < 12_000_000) {
            month++;
            total *= percent;
            total += sum;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений: " + total + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int sum = 15_000;
        int total = 0;
        double percent = 1.07;
        int month = 0;
        while (month < 108) {
            month++;
            total *= percent;
            total += sum;
            if (month % 6 == 0) {
                System.out.println("Сумма за " + month + " месяцев равна " + total);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int dayOfTheMonthFriday = 3;
        for (; dayOfTheMonthFriday <= 31; dayOfTheMonthFriday = dayOfTheMonthFriday + 7) {
            System.out.println("Сегодня пятница, " + dayOfTheMonthFriday + "-ое число. Необходимо подгтовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int currentYear = 2022;
        int twoHundredYearsAgo = currentYear - 200;
        int oneHundredYearsAfter = currentYear + 100;
        int yearComet = 0;
        while (yearComet <= oneHundredYearsAfter) {
            yearComet += 79;
            if (yearComet >= twoHundredYearsAgo && yearComet <= oneHundredYearsAfter) {
                System.out.println(yearComet);
            }
        }
    }
}