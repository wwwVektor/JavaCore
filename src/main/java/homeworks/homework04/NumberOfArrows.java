package homeworks.homework04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Задана последовательность, состоящая только из символов ‘>’, ‘<’ и‘-‘. Требуется найти количество стрел, которые
спрятаны в этой последовательности. Стрелы – это подстроки вида ‘>>-->’ и ‘<--<<’.
Входные данные: в первой строке входного потока записана строка, состоящая из символов ‘>’, ‘<’ и ‘-‘ (без пробелов).
Строка может содержать до 106 символов.
Выходные данные: в единственную строку выходного потока нужно вывести искомое количество стрелок.
*/

public class NumberOfArrows {
    public static void main(String[] args) {
        String arrows = ">>-->>>-->-->><<--<<--<<--<<-->>>>-->";

        Pattern pattern = Pattern.compile(">>-->|<--<<");
        Matcher matcher = pattern.matcher(arrows);

        int counter = 0;

        while (matcher.find()) {
            counter++;
        }
        System.out.println("Количество стрелок: " + counter);
    }
}
