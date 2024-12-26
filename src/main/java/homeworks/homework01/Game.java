package homeworks.homework01;

public class Game {
    public static void main(String[] args) {
        int vasili = (int) (Math.random() * 3);
        int petr = (int) (Math.random() * 3);
        if (vasili == petr) {
            System.out.println("Ничья");
        } else if (vasili == 0 & petr == 1 | vasili == 1 & petr == 2 | vasili == 2 & petr == 0) {
            System.out.println("Петр выйграл");
        } else {
            System.out.println("Василий выйграл");
        }
    }
}
