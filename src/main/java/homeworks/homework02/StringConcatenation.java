package homeworks.homework02;

import java.util.Scanner;
/*
    Напишите Java-программу для объединения данной строки с самим собой заданное количество раз.

    Тестовые данные:
    Исходная строка: Java
    Сколько раз вывести строку? 8
    Ожидаемый результат:
    После повторения 8 раз: JavaJavaJavaJavaJavaJavaJavaJava
 */

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите исходную строку: ");
        String str = scanner.nextLine();
        System.out.println("Сколько раз вывести строку? ");
        int number = scanner.nextInt();

        String result = str.repeat(number);
        System.out.println("После повторения " + number + " раз: " + result);
    }
}