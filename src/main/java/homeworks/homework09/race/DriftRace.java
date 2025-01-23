package homeworks.homework09.race;

import homeworks.homework09.cars.Car;

import java.util.Collection;

public class DriftRace extends Race {

    public DriftRace(int length, String route, int prizeFund, Collection<Car> participants) {
        super(length, route, prizeFund, participants);
    }

    public DriftRace() {
    }

    @Override
    public String toString() {
        return "DriftRace{" +
                "length=" + super.getLength() +
                ", route='" + super.getRoute() + '\'' +
                ", prizeFund=" + super.getPrizeFund() +
                ", participants=" + super.getParticipants() +
                '}';
    }
}
