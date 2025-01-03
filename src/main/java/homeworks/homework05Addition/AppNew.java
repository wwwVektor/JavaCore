package homeworks.homework05Addition;

import java.util.*;

public class AppNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<TelevisionNew> televisions = new ArrayList<>();

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
            boolean televisionOnOrOff = scanner.nextLine().equalsIgnoreCase("да");

            TelevisionNew tv = new TelevisionNew(brand, diagonal, channelNumber, volume, televisionOnOrOff);
            televisions.add(tv);
        }

        System.out.print("\nВведите максимальное допустимое значение громкости (рекомендуется от 50 до 70): ");
        int maxVolume = scanner.nextInt();

        televisions.sort(Comparator.comparing(TelevisionNew::getNumberChannel));

        System.out.println("\nВключённые телевизоры с допустимой громкостью:");
        for (TelevisionNew tv : televisions) {
            if (tv.getTelevisionOnOrOff() && tv.getVolume() <= maxVolume) {
                System.out.println(tv);
                System.out.println("----------------------");
            }
        }
    }
}