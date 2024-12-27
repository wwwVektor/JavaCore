package homeworks.homework04;
import java.util.Scanner;

/*
Для введенной с клавиатуры буквы английского алфавита нужно вывести слева стоящую букву на стандартной клавиатуре.
Входные данные: строка входного потока содержит один символ — маленькую букву английского алфавита.
Выходные данные: следует вывести букву стоящую слева от заданной буквы, с учетом замкнутости клавиатуры.
*/

public class Alphabet {

    public static void main(String[] args) {
        String letterKeyboard = "qwertyuiopasdfghjklzxcvbnm";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите букву: ");
        String inputLetter = scanner.nextLine();

        StringBuilder outputLetter = new StringBuilder();

        for (char c : inputLetter.toCharArray()) {
            int index = letterKeyboard.indexOf(c);

            if (index == -1) {
                System.out.println(outputLetter.append("Введенный символ ").append(c).append(" не соответсвет поставленной задачи!"));
            } else {
                int previousIndex = (index + letterKeyboard.length() - 1) % letterKeyboard.length();
                outputLetter.append(letterKeyboard.charAt(previousIndex));
                System.out.println("Буква стоящая слева от введеной буквы: " + outputLetter);
            }
        }
    }
}