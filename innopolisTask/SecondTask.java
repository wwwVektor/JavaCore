import java.util.Scanner;

public class SecondTask {
    public static final String ODD_NUMBER = "Число четное";
    public static final String NOT_ODD_NUMBER = "Число нечетное";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println(ODD_NUMBER);
        } else {
            System.out.println(NOT_ODD_NUMBER);
        }
    }
}