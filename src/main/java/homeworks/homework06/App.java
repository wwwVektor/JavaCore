package homeworks.homework06;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя покупателя: ");
        String name = scanner.nextLine();
            if (name.isEmpty()){
                throw new IllegalArgumentException("Ошибка: Имя не может быть пустой строкой!");
            }

        System.out.print("Введите бюджет покупателя: ");
        int money = scanner.nextInt();
            if (money < 0){
                throw new IllegalArgumentException("Ошибка: Деньги не могут быть отрицательным числом!");
            }

        Person buyer = new Person(name, money);

        System.out.println("Добавьте продукты в корзину");
        scanner.nextLine();
        boolean check = true;
        while (check){
            System.out.print("Введите название продукта: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                throw new IllegalArgumentException("Ошибка: Название продукта не может быть пустой строкой!");
            } else if (title.equalsIgnoreCase("END")) {
                break;
            }

            System.out.print("Введите цену продукта: ");
            int price;
            try {
                price = Integer.parseInt(scanner.nextLine());
                if (price < 0) {
                    System.out.println("Ошибка: Стоимость продукта не может быть отрицательным числом! Попробуйте снова.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Цена должна быть целым числом! Попробуйте снова.");
                continue;
            }

            Product newProduct = new Product(title, price);
            buyer.addProductToBasket(newProduct);
        }

        System.out.println("Корзина покупателя:");
        for (Product product : buyer.getBasket()) {
            if (product != null) {
                System.out.println(buyer.getName() + " купил " + product.getTitle());
            }
        }
        if (buyer.getMoney() == 0) {
            System.out.println(buyer.getName() + " - Ничего не куплено");
        }
    }
}