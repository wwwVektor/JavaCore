package homeworks.homework012;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.IOException;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите фамилию, имя, отчество, дату рождения (dd.mm.yyyy), номер телефона, пол (f/m) и возраст через пробел: ");
        String input = scanner.nextLine();
        scanner.close();

        try {
            String[] fields = input.split(" ");
            if (fields.length != 7) {
                throw new IllegalArgumentException("Некорректное количество параметров. Должны быть введены: фамилия, имя, отчество, дата рождения, номер телефона, пол и возраст.");
            }

            String lastName = fields[0];
            String firstName = fields[1];
            String middleName = fields[2];
            LocalDate birthDate = parseBirthDate(fields[3]);
            long phoneNumber = parsePhoneNumber(fields[4]);
            char gender = parseGender(fields[5].charAt(0));
            int age = parseAge(fields[6]);

            Person person = new Person(lastName, firstName, middleName, birthDate, phoneNumber, gender, age);
            saveToFile(person);

            System.out.println("Данные сохранены в файл " + lastName + ".txt");
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка ввода: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка записи файла: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ошибка: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static LocalDate parseBirthDate(String dateStr) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return LocalDate.parse(dateStr, formatter);
    }

    private static long parsePhoneNumber(String phoneStr) throws NumberFormatException {
        return Long.parseLong(phoneStr);
    }

    private static char parseGender(char genderChar) throws IllegalArgumentException {
        if (genderChar != 'm' && genderChar != 'f') {
            throw new IllegalArgumentException("Пол должен быть либо 'm', либо 'f'.");
        }
        return genderChar;
    }

    private static int parseAge(String ageStr) throws NumberFormatException {
        return Integer.parseInt(ageStr);
    }

    private static void saveToFile(Person person) throws IOException {
        FileWriter writer = new FileWriter(person.getLastName() + ".txt", true);
        writer.write(person.toString() + "\n");
        writer.close();
    }
}
