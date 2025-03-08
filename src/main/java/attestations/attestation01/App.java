package attestations.attestation01;

import attestations.attestation01.model.User;
import attestations.attestation01.repositories.UsersRepositoryFileImpl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class App {
    public static void main(String[] args) {
        UsersRepositoryFileImpl userRepo = new UsersRepositoryFileImpl("users.txt");

        User user1 = new User(
                UUID.randomUUID().toString(),
                LocalDateTime.now(),
                "test_user1",
                "pass123",
                "pass123",
                "Иванов",
                "Иван",
                "Иванович",
                30,
                true
        );

        User user2 = new User(
                UUID.randomUUID().toString(),
                LocalDateTime.now(),
                "test_user2",
                "pass456",
                "pass456",
                "Петров",
                "Петр",
                "Петрович",
                35,
                false
        );

        userRepo.create(user1);
        userRepo.create(user2);
        System.out.println("Пользователи добавлены!");

        User foundUser = userRepo.findById(user1.getId());
        System.out.println("Пользователь найден: " + foundUser);

        List<User> allUsers = userRepo.findAll();
        System.out.println("Все пользователи:");
        allUsers.forEach(System.out::println);

        user1.setPassword("new_password123", "new_password123");
        userRepo.update(user1);
        System.out.println("Данные пользователя обновлены!");

        userRepo.deleteById(user2.getId());
        System.out.println("Пользователь удален!");

        userRepo.deleteAll();
        System.out.println("Все пользователи удалены!");
    }
}
