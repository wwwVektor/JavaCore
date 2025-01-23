package homeworks.homework09.race;

import homeworks.homework09.cars.Car;

import java.util.Collection;

public class DragRace extends Race {

    public DragRace(int length, String route, int prizeFund, Collection<Car> participants) {
        super(length, route, prizeFund, participants);
    }
    public DragRace() {
    }

    @Override
    public String toString() {
        return "DragRace{" +
                "length=" + super.getLength() +
                ", route='" + super.getRoute() + '\'' +
                ", prizeFund=" + super.getPrizeFund() +
                ", participants=" + super.getParticipants() +
                '}';
    }
}
