package homeworks.homework05Addition;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Television> televisions = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Введите информацию о телевизоре №" + (i + 1) + ":");

            System.out.print("Бренд: ");
            String brand = scanner.nextLine();

            System.out.print("Диагональ: ");
            int diagonal = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Номер канала: ");
            int channelNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Громкость: ");
            int volume = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Включен или нет (да/нет): ");
            boolean isOn = scanner.nextLine().equalsIgnoreCase("да");

            Television tv = new Television(brand, diagonal, channelNumber, volume, isOn);
            televisions.add(tv);
        }

        System.out.print("\nВведите максимальное допустимое значение громкости (рекомендуется от 50 до 70): ");
        int maxVolume = scanner.nextInt();

        televisions.sort(Comparator.comparing(Television::getNumberChannel));

        System.out.println("\nВключённые телевизоры с допустимой громкостью:");
        for (Television tv : televisions) {
            if (tv.getOn() && tv.getVolume() <= maxVolume) {
                System.out.println(tv);
                System.out.println("----------------------");
            }
        }
    }
}