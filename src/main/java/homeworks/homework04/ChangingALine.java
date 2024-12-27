package homeworks.homework04;

import java.util.Arrays;

/*
Задана строка, состоящая из букв английского алфавита, разделенных одним пробелом. Необходимо каждую последовательность
символов упорядочить по возрастанию и вывести слова в нижнем регистре.
Входные данные: в единственной строке последовательность символов представляющее два слова.
Выходные данные: упорядоченные по возрастанию буквы в нижнем регистре.
 */

public class ChangingALine {
    public static void main(String[] args) {
        String inputString = "GfrdTvdGERbdhbdPtEaHTsd kiWpeOaNhvvDPJCCEeeddgvd";

        char[] tempArray = inputString.toLowerCase().toCharArray();
        Arrays.sort(tempArray);

        System.out.println(tempArray);
    }
}
