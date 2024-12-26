package homeworks.homework03;

public class App {
    /*
    Реализовать класс Телевизор.
    У класса есть поля, свойства и методы.
    Проверить работу в классе App, методе main.
    Обратить внимание на переопределение метода toString.
     */
    public static void main(String[] args) {
        Television samsung = new Television("Samsung Ultra HD", true, 50299.99, 55, 30);
        Television lg = new Television("LG 4K Ultra HD", false, 140099.99, 65, 25);

        Television defaultTelevision = new Television();
        defaultTelevision.setModel("Philips");
        defaultTelevision.setDiagonal(55);

        System.out.println(defaultTelevision);
        System.out.println(samsung);
        System.out.println(lg);
        System.out.println(samsung.getPrice());
        System.out.println(lg.getDiagonal());
    }
}
