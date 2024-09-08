import java.util.Scanner;

public class Main {

    // 1. Программа, которая выводит на экран числа от 1 до 10.
    public static void printNumbers() {
        System.out.println("Числа от 1 до 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Перенос строки
    }

    // 2. Программа, которая находит сумму всех чисел от 1 до 100.
    public static void sumOfNumbers() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Сумма всех чисел от 1 до 100 = " + sum);
    }

    // 3. Метод для нахождения факториала заданного числа.
    public static void factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Факториал числа " + number + " = " + factorial);
    }

    // 4. Метод для вывода дней недели на основе введенного числа.
    public static void printDayOfWeek(int day) {
        if (day == 1) {
            System.out.println("Понедельник");
        } else if (day == 2) {
            System.out.println("Вторник");
        } else if (day == 3) {
            System.out.println("Среда");
        } else if (day == 4) {
            System.out.println("Четверг");
        } else if (day == 5) {
            System.out.println("Пятница");
        } else if (day == 6 || day == 7) {
            System.out.println("Выходной");
        } else {
            System.out.println("Некорректный ввод. Введите число от 1 до 7.");
        }
    }

    // 5. Распечатать 10 строк циклом while.
    public static void printLinesWhile() {
        int count = 1;
        while (count <= 10) {
            System.out.println("Это строка номер " + count);
            count++;
        }
    }

    // 6. Распечатать 10 строк "Task1", "Task2", ..., "Task10" с помощью цикла while.
    public static void printTasksWhile() {
        int count = 1;
        while (count <= 10) {
            System.out.println("Task" + count);
            count++;
        }
    }

    public static void main(String[] args) {
        // Выполнение всех задач.
        printNumbers();
        sumOfNumbers();

        // Получение числа для факториала
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для нахождения факториала: ");
        int number = scanner.nextInt();
        factorial(number);

        // Получение номера дня недели
        System.out.print("Введите номер дня недели (1-7): ");
        int day = scanner.nextInt();
        printDayOfWeek(day);

        // Печать 10 строк с использованием цикла while
        printLinesWhile();

        // Печать задач с использованием цикла while
        printTasksWhile();

        scanner.close();
    }
}