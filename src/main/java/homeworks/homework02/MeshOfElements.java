package homeworks.homework02;

import java.util.Scanner;
/*
    Напишите программу на Java для печати сетки из заданных элементов.
    Тестовые данные: Введите число строк и столбцов сетки: 10
    Введите повторяемый элемент сетки: -
    Ожидаемый результат: Сетка по запросу 10 на 10
*/

public class MeshOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число строк и столбцов сетки: ");
        int number = scanner.nextInt();
        System.out.println("Введите повторяемый элемент сетки: ");
        char element = scanner.next().charAt(0);
        System.out.println("Сетка по запросу " + number + " на " + number);

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(element);
            }
            System.out.println();
        }
    }
}
