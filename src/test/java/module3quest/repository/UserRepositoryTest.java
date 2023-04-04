package module3quest.repository;

import module3quest.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    @Test
    void getUserById() {
        Integer userId = UserRepository.getIdForNewUser("Name1");
        Assertions.assertNotNull(UserRepository.getUserById(userId));

    }

    @Test
    void getIdForNewUser() {
        Integer firstUserId = UserRepository.getIdForNewUser("Name1");
        Integer secondUserId = UserRepository.getIdForNewUser("Name2");
        Assertions.assertNotEquals(firstUserId, secondUserId);
    }
}