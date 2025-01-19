package homeworks.homework06;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    private String name;
    private Integer money;
    private Product[] basket = new Product[10];
    private int index = 0;

    public Person(String name, Integer money) {
        this.name = name;
        this.money = money;
    }

    public void addProductToBasket(Product product) {
        if (this.money >= product.getPrice()){
            this.basket[index] = product;
            this.money -= product.getPrice();
            index++;
            System.out.println("Продукт " + product.getTitle() + " успешно добавлен в корзину.");
        } else {
            System.out.println(getName() + " не может позволить себе " + product.getTitle());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Product[] getBasket() {
        return basket;
    }

    public void setBasket(Product[] basket) {
        this.basket = basket;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", basket=" + Arrays.toString(basket) +
                ", index=" + index +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        return index == person.index && Objects.equals(name, person.name) && Objects.equals(money, person.money) && Objects.deepEquals(basket, person.basket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, money, Arrays.hashCode(basket), index);
    }
}
