package module3quest.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {


    @Test
    void getLostGamesNotNull() {
        User user = new User("Name");
        Assertions.assertNotNull(user.getLostGames());
    }

    @Test
    void getWonGamesNotNull() {
        User user = new User("Name");
        Assertions.assertNotNull(user.getWonGames());
    }

    @Test
    void gameIsWon() {
        User user = new User("Name");
        user.gameIsWon();
        Assertions.assertEquals(1, user.getWonGames());
    }

    @Test
    void gameIsLost() {
        User user = new User("Name");
        user.gameIsLost();
        Assertions.assertEquals(1, user.getLostGames());
    }
}