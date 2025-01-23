package homeworks.homework09.cars;

import java.util.Objects;

public class ShowCar extends Car {
    private int stars = 0;

    public ShowCar() {
    }

    public ShowCar(int stars) {
        this.stars = stars;
    }

    public ShowCar(String brand, String model, int year, int power, int boost, int suspension, int durable, int stars) {
        super(brand, model, year, power, boost, suspension, durable);
        this.stars = stars;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "ShowCar{" +
                "brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", year=" + super.getYear() +
                ", power=" + super.getPower() +
                ", boost=" + super.getBoost() +
                ", suspension=" + super.getSuspension() +
                ", durable=" + super.getDurable() +
                ", stars=" + stars +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ShowCar showCar)) return false;
        if (!super.equals(o)) return false;
        return stars == showCar.stars;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), stars);
    }
}
