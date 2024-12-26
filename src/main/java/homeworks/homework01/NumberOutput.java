package homeworks.homework01;

import java.util.Scanner;

public class NumberOutput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");

        int number = scan.nextInt();
        System.out.println(number + " " + number + " " + number + " " + number);
    }
}
