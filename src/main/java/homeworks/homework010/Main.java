package homeworks.homework010;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {10, 21, 22, 32, 43, 54, 62};

        System.out.println("Исходный массив: " + Arrays.toString(numbers));

        int[] evenNumbers = Sequence.filter(numbers, n -> n % 2 == 0);
        System.out.println("Четные числа: " + Arrays.toString(evenNumbers));

        int[] sumOfDigitsIsEven = Sequence.filter(numbers, n -> {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum % 2 == 0;
        });
        System.out.println("Сумма цифр элементов являющиеся четными: " + Arrays.toString(sumOfDigitsIsEven));
    }
}