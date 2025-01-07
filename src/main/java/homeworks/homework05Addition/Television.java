package homeworks.homework05Addition;

import java.util.Objects;

public class Television {
    private String brand;
    private Boolean smartTV;
    private Double price;
    private Integer diagonal;
    private Integer weight;
    private Integer numberChannel;
    private Integer volume;
    private Boolean isOn;

    public Television() {
    }

    public Television(String brand, Boolean smartTV, Double price, Integer diagonal, Integer weight, Integer numberChannel,
                      Integer volume, Boolean isOn) {
        this.brand = brand;
        this.smartTV = smartTV;
        this.price = price;
        this.diagonal = diagonal;
        this.weight = weight;
        this.numberChannel = numberChannel;
        this.volume = volume;
        this.isOn = isOn;
    }

    public Television(String brand, int diagonal, int numberChannel, int volume, boolean isOn) {
        this(brand, null, null, diagonal, null, numberChannel, volume, isOn);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Boolean getSmartTV() {
        return smartTV;
    }

    public void setSmartTV(Boolean smartTV) {
        this.smartTV = smartTV;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(Integer diagonal) {
        this.diagonal = diagonal;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getNumberChannel() {
        return numberChannel;
    }

    public void setNumberChannel(Integer numberChannel) {
        this.numberChannel = numberChannel;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Boolean getOn() {
        return isOn;
    }

    public void setOn(Boolean on) {
        isOn = on;
    }

    @Override
    public String toString() {
        return "Television{" +
                "brand='" + brand + '\'' +
                ", smartTV=" + smartTV +
                ", price=" + price +
                ", diagonal=" + diagonal +
                ", weight=" + weight +
                ", numberChannel=" + numberChannel +
                ", volume=" + volume +
                ", isOn=" + isOn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Television that)) return false;
        return Objects.equals(brand, that.brand) && Objects.equals(smartTV, that.smartTV) && Objects.equals(price, that.price) && Objects.equals(diagonal, that.diagonal) && Objects.equals(weight, that.weight) && Objects.equals(numberChannel, that.numberChannel) && Objects.equals(volume, that.volume) && Objects.equals(isOn, that.isOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, smartTV, price, diagonal, weight, numberChannel, volume, isOn);
    }
}
