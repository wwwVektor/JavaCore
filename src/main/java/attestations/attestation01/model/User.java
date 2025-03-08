package attestations.attestation01.model;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;

public class User {
    private String id;
    private LocalDateTime dateTime;
    private String login;
    private String password;
    private String confirmPassword;
    private String surname;
    private String name;
    private String patronymic;
    private Integer age;
    private boolean isWorker;

    private static final Pattern LOGIN_PATTERN = Pattern.compile("^(?=.*[a-zA-Z])\\w{1,20}$");
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("^(?=.*[0-9])(?=.*[a-zA-Z])\\w{1,20}$");
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Zа-яА-ЯёЁ]+$");

    public User(String id, LocalDateTime dateTime, String login, String password, String confirmPassword,
                String surname, String name, String patronymic, Integer age, boolean isWorker) {
        this.id = id != null ? id : UUID.randomUUID().toString();
        this.dateTime = dateTime != null ? dateTime : LocalDateTime.now();
        setLogin(login);
        setPassword(password, confirmPassword);
        setSurname(surname);
        setName(name);
        setPatronymic(patronymic);
        setAge(age);
        this.isWorker = isWorker;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (!LOGIN_PATTERN.matcher(login).matches()) {
            throw new IllegalArgumentException("Логин должен содержать хотя бы одну букву, можно цифры и _, не более 20 символов.");
        }
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, String confirmPassword) {
        password = password.trim();
        confirmPassword = confirmPassword.trim();
        if (!PASSWORD_PATTERN.matcher(password).matches()) {
            throw new IllegalArgumentException("Пароль должен содержать хотя бы одну цифру, буквы, можно _, не более 20 символов.");
        }
        if (!password.equals(confirmPassword)) {
            throw new IllegalArgumentException("Пароли не совпадают.");
        }
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (!NAME_PATTERN.matcher(surname).matches()) {
            throw new IllegalArgumentException("Фамилия должна содержать только буквы.");
        }
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!NAME_PATTERN.matcher(name).matches()) {
            throw new IllegalArgumentException("Имя должно содержать только буквы.");
        }
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        if (patronymic != null && !patronymic.isEmpty() && !NAME_PATTERN.matcher(patronymic).matches()) {
            throw new IllegalArgumentException("Отчество должно содержать только буквы.");
        }
        this.patronymic = patronymic;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age == null || age < 0 || age > 150) {
            throw new IllegalArgumentException("Возраст должен быть положительным числом и не превышать 150 лет.");
        }
        this.age = age;
    }

    public boolean isWorker() {
        return isWorker;
    }

    public void setWorker(boolean isWorker) {
        this.isWorker = isWorker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return isWorker == user.isWorker && Objects.equals(id, user.id) && Objects.equals(dateTime, user.dateTime)
                && Objects.equals(login, user.login) && Objects.equals(password, user.password)
                && Objects.equals(confirmPassword, user.confirmPassword) && Objects.equals(surname, user.surname)
                && Objects.equals(name, user.name) && Objects.equals(patronymic, user.patronymic)
                && Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateTime, login, password, confirmPassword, surname, name, patronymic, age, isWorker);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", dateTime=" + dateTime +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age +
                ", isWorker=" + isWorker +
                '}';
    }
}
