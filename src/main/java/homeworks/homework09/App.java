package homeworks.homework09;

import homeworks.homework09.cars.Car;
import homeworks.homework09.cars.PerformanceCar;
import homeworks.homework09.cars.ShowCar;
import homeworks.homework09.race.CasualRace;
import homeworks.homework09.race.DragRace;
import homeworks.homework09.race.DriftRace;
import homeworks.homework09.race.Race;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Car car = new Car("BMW","S5", 1995, 150, 50, 50, 60 );
        PerformanceCar performanceCar = new PerformanceCar("Ferrari ", "F2004", 2020, 550, 20,
                60, 10, new String[]{"String1", "String2"});
        ShowCar showCar = new ShowCar("Toyota", "Camry", 2022, 150, 15, 60,
                15, 95);

        Race race = new Race();
        CasualRace casualRace = new CasualRace(100, "Monaco", 100000, new ArrayList<>());
        DragRace dragRace = new DragRace(400, "Las Vegas Strip", 1000000, new ArrayList<>());
        DriftRace driftRace = new DriftRace(300, "Tokyo Bay" , 10000000, new ArrayList<>());

        System.out.println(car);
        System.out.println(performanceCar);
        System.out.println(showCar);
        System.out.println(race);
        System.out.println(casualRace);
        System.out.println(dragRace);
        System.out.println(driftRace);
    }
}
