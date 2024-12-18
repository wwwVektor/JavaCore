import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Результат вашего ввода: a=" + a + "; b=" + b + "; c=" + c);
        int temp = c;
        c = b;
        b = a;
        a = temp;
        System.out.println("Результат работы программы: a=" + a + "; b=" + b + "; c=" + c);
        System.out.printf("a = %d, b = %d, c = %d",a, b, c);
    }
}
