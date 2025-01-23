package homeworks.homework09.race;

import homeworks.homework09.cars.Car;

import java.util.Collection;
import java.util.Objects;

public class Race {
    private int length;
    private String route;
    private int prizeFund;
    private Collection<Car> participants;

    public Race(int length, String route, int prizeFund, Collection<Car> participants) {
        this.length = length;
        this.route = route;
        this.prizeFund = prizeFund;
        this.participants = participants;
    }

    public Race() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getPrizeFund() {
        return prizeFund;
    }

    public void setPrizeFund(int prizeFund) {
        this.prizeFund = prizeFund;
    }

    public Collection<Car> getParticipants() {
        return participants;
    }

    public void setParticipants(Collection<Car> participants) {
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "Race{" +
                "length=" + length +
                ", route='" + route + '\'' +
                ", prizeFund=" + prizeFund +
                ", participants=" + participants +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Race race)) return false;
        return length == race.length && prizeFund == race.prizeFund && Objects.equals(route, race.route) && Objects.equals(participants, race.participants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, route, prizeFund, participants);
    }
}
