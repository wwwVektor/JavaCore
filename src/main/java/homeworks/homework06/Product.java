package homeworks.homework06;

import java.util.Objects;

public class Product {
    private String title;
    private Integer price;

    public Product(String title, Integer price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
     }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product product)) return false;
        return Objects.equals(title, product.title) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }
}