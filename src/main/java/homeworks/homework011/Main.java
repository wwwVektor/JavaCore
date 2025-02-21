package homeworks.homework011;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("a123me", "Mercedes", "White", 0, 8300000));
        cars.add(new Car("b873of", "Volga", "Black", 0, 673000));
        cars.add(new Car("w487mn","Lexus","Grey",76000,900000));
        cars.add(new Car("p987hj","Volga","Red",610,704340));
        cars.add(new Car("c987ss","Toyota","White",254000,761000));
        cars.add(new Car("o983op","Toyota","Black",698000,740000));
        cars.add(new Car("p146op","BMW","White",271000,850000));
        cars.add(new Car("u893ii","Toyota","Purple",210900,440000));
        cars.add(new Car("l097df","Toyota","Black",108000,780000));
        cars.add(new Car("y876wd","Toyota","Black",160000,1000000));

        System.out.println("Автомобили в базе:");
        cars.forEach(System.out::println);

        countUniqueModelsInPriceRange(cars, 700000, 800000);
        findCheapestCarColor(cars);
    }

    private static void findCheapestCarColor(List<Car> cars) {
        String cheapestCarColor = cars.stream()
                .min((car1, car2) -> Double.compare(car1.getPrice(), car2.getPrice()))
                .map(Car::getColor)
                .orElse(null);

        System.out.println("Цвет автомобиля с минимальной стоимостью: " + cheapestCarColor);
    }

    private static void countUniqueModelsInPriceRange(List<Car> cars, double minPrice, double maxPrice) {
        long uniqueModelsCount = cars.stream()
                .filter(car -> car.getPrice() >= minPrice && car.getPrice() <= maxPrice)
                .distinct()
                .count();
        System.out.println("Количество уникальных моделей в ценовом диапазоне от "
                + minPrice + " до " + maxPrice + ": " + uniqueModelsCount);
    }
}
