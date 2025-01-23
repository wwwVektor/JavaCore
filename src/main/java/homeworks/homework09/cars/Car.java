package homeworks.homework09.cars;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private int year;
    private int power;
    private int boost;
    private int suspension;
    private int durable;

    public Car() {
    }

    public Car(String brand, String model, int year, int power, int boost, int suspension, int durable) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.power = power;
        this.boost = boost;
        this.suspension = suspension;
        this.durable = durable;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", power=" + power +
                ", boost=" + boost +
                ", suspension=" + suspension +
                ", durable=" + durable +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getBoost() {
        return boost;
    }

    public void setBoost(int boost) {
        this.boost = boost;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSuspension() {
        return suspension;
    }

    public void setSuspension(int suspension) {
        this.suspension = suspension;
    }

    public int getDurable() {
        return durable;
    }

    public void setDurable(int durable) {
        this.durable = durable;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car car)) return false;
        return year == car.year && power == car.power && boost == car.boost && suspension == car.suspension && durable == car.durable && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, power, boost, suspension, durable);
    }
}
