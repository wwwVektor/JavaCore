package homeworks.homework09.cars;


import java.util.Arrays;
import java.util.Objects;

public class PerformanceCar extends Car {
    private String[] addOns = new String[0];

    public PerformanceCar() {
    }

    public PerformanceCar(String[] addOns) {
        this.addOns = addOns;
    }

    public PerformanceCar(String brand, String model, int year, int power, int boost, int suspension, int durable, String[] addOns) {
        super(brand, model, year, power, boost, suspension, durable);
        this.addOns = addOns;
    }

    public String[] getAddOns() {
        return addOns;
    }

    public void setAddOns(String[] addOns) {
        this.addOns = addOns;
    }

    @Override
    public int getPower() {
        return super.getPower() + 50;
    }

    @Override
    public int getSuspension() {
        return super.getSuspension() - 25;
    }

    @Override
    public String toString() {
        return "PerformanceCar{" +
                "brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", year=" + super.getYear() +
                ", power=" + super.getPower() +
                ", boost=" + super.getBoost() +
                ", suspension=" + super.getSuspension() +
                ", durable=" + super.getDurable() +
                ", addOns=" + Arrays.toString(addOns) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PerformanceCar that)) return false;
        if (!super.equals(o)) return false;
        return Objects.deepEquals(addOns, that.addOns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Arrays.hashCode(addOns));
    }
}
