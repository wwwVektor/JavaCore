package homeworks.homework09;

import homeworks.homework09.cars.Car;

import java.util.Collection;
import java.util.Objects;

public class Garage {
    private Collection<Car> parkedCar;

    public Garage(Collection<Car> parkedCar) {
        this.parkedCar = parkedCar;
    }

    public Collection<Car> getParkedCar() {
        return parkedCar;
    }

    public void setParkedCar(Collection<Car> parkedCar) {
        this.parkedCar = parkedCar;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "parkedCar=" + parkedCar +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Garage garage)) return false;
        return Objects.equals(parkedCar, garage.parkedCar);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(parkedCar);
    }
}
