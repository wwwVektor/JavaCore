package main.java.attestations.attestation01.model;

import attestations.attestation01.model.User;
import attestations.attestation01.repositories.UsersRepository;
import attestations.attestation01.repositories.UsersRepositoryFileImpl;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTests {
    private final UsersRepository repository = new UsersRepositoryFileImpl("users.txt");

    @Test
    public void testCreateUser() {
        User user = new User(
                UUID.randomUUID().toString(),
                LocalDateTime.now(),
                "test_user",
                "pass123",
                "pass123",
                "Иванов",
                "Иван",
                "Иванович",
                30,
                true
        );

        repository.create(user);

        assertEquals(user, repository.findById(user.getId()));
    }

    @Test
    public void testFindById() {
        User user = new User(
                UUID.randomUUID().toString(),
                LocalDateTime.now(),
                "test_user",
                "pass123",
                "pass123",
                "Иванов",
                "Иван",
                "Иванович",
                30,
                true
        );

        repository.create(user);

        assertEquals(user, repository.findById(user.getId()));
    }

    @Test
    public void testUpdateUser() {
        User user = new User(
                UUID.randomUUID().toString(),
                LocalDateTime.now(),
                "test_user",
                "pass123",
                "pass123",
                "Иванов",
                "Иван",
                "Иванович",
                30,
                true
        );

        repository.create(user);

        user.setName("Алексей");
        repository.update(user);

        assertEquals("Алексей", repository.findById(user.getId()).getName());
    }

    @Test
    public void testDeleteUser() {
        User user = new User(
                UUID.randomUUID().toString(),
                LocalDateTime.now(),
                "test_user",
                "pass123",
                "pass123",
                "Иванов",
                "Иван",
                "Иванович",
                30,
                true
        );

        repository.create(user);

        repository.deleteById(user.getId());

        assertThrows(IllegalArgumentException.class, () -> repository.findById(user.getId()));
    }
}
