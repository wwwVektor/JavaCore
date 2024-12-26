package homeworks.homework02;

import java.util.Scanner;
/*
    Напишите Java-программу для преобразования температуры из Фаренгейта в градусы Цельсия.

    Тестовые данные:
    Введите степень в градусах Фаренгейта: 212
    Ожидаемый результат:
    212.0 градусов по Фаренгейту равна 100.0 по Цельсию
*/

public class Converting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите степень в градусах Фаренгейта: ");
        double degreesToFahrenheit = scanner.nextDouble();

        double degreesInCelsius = (degreesToFahrenheit - 32) / 1.8;
        System.out.println(degreesToFahrenheit + " градусов по Фаренгейту равна "
                            + degreesInCelsius + " по Цельсию");

    }
}