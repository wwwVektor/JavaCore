package homeworks.homework03;

public class Television {
    private String model;
    private Boolean smartTV;
    private Double price;
    private Integer diagonal;
    private Integer weight;

    public Television() {}

    public Television(String model, Boolean smartTV, Double price, Integer diagonal, Integer weight) {
        this.model = model;
        this.smartTV = smartTV;
        this.price = price;
        this.diagonal = diagonal;
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    @Override
    public String toString() {
        return "Television{" +
                "model='" + model + '\'' +
                ", smartTV=" + smartTV +
                ", price=" + price +
                ", diagonal=" + diagonal +
                ", weight=" + weight +
                '}';
    }

}
