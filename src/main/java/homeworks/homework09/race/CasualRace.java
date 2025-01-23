package homeworks.homework09.race;

import homeworks.homework09.cars.Car;

import java.util.Collection;

public class CasualRace extends Race{

    public CasualRace(int length, String route, int prizeFund, Collection<Car> participants) {
        super(length, route, prizeFund, participants);
    }

    public CasualRace() {
    }

    @Override
    public String toString() {
        return "CasualRace{" +
                "length=" + super.getLength() +
                ", route='" + super.getRoute() + '\'' +
                ", prizeFund=" + super.getPrizeFund() +
                ", participants=" + super.getParticipants() +
                '}';
    }
}
