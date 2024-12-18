package homework05Addition;

public class AppNew {
    /*
    Реализовать класс Телевизор.
    У класса есть поля, свойства и методы.
    Проверить работу в классе App, методе main.
    Обратить внимание на переопределение метода toString.
     */
    public static void main(String[] args) {
        TelevisionNew samsung = new TelevisionNew("Samsung Ultra HD", true, 50299.99,
                55, 30, 22, 80, true);
        TelevisionNew lg = new TelevisionNew("LG 4K Ultra HD", false, 140099.99,
                65, 25, 6, 100, false);

        TelevisionNew defaultTelevision = new TelevisionNew();
        defaultTelevision.setModel("Philips");
        defaultTelevision.setDiagonal(55);

        System.out.println(defaultTelevision);
        System.out.println(samsung);
        System.out.println(lg);
        System.out.println(samsung.getPrice());
        System.out.println(lg.getDiagonal());
    }
}
