import java.util.Scanner;

public class ThirdTask {
    public static final Integer VIP_PRICE = 125;
    public static final Integer PREMIUM_PRICE = 110;
    public static final Integer STANDART_PRICE = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roomType = scanner.nextInt();

        switch (roomType) {
            case 1 -> System.out.println(VIP_PRICE);
            case 2 -> System.out.println(PREMIUM_PRICE);
            case 3 -> System.out.println(STANDART_PRICE);
            default -> System.out.println("No such room type");

        }
    }
}