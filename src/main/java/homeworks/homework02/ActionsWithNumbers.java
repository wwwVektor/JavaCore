package homeworks.homework02;

import java.util.Scanner;
/*
    Напишите программу на Java, которая принимает два целых числа от пользователя,
    а затем печатает сумму, разницу, произведение, среднее значение,
    расстояние (разница между целыми числами), максимум (большее из двух целых чисел),
    минимум (меньшее из двух целых чисел).
    Тестовые данные: Введите 1-е целое число: 25
    Введите второе целое число: 5
 */

public class ActionsWithNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1-е целое число: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int work = firstNumber * secondNumber;
        double average = (firstNumber + secondNumber) / 2.0;
        int distance = Math.max(firstNumber, secondNumber) - Math.min(firstNumber, secondNumber);
        int maxNumber = Math.max(firstNumber, secondNumber);
        int minNumber = Math.min(firstNumber, secondNumber);

        System.out.println("Сумма двух чисел: " + sum);
        System.out.println("Разница двух целых чисел: " + difference);
        System.out.println("Произведение из двух целых чисел: " + work);
        System.out.println("Среднее из двух целых чисел: " + average);
        System.out.println("Расстояние двух целых чисел: " + distance);
        System.out.println("Максимальное целое число: " + maxNumber);
        System.out.println("Минимальное целое число: " + minNumber);
    }
}
