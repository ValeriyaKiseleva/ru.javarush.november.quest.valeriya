package module3quest.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class QuestServiceTest {

    @Test
    void startGame() throws ServletException, IOException {
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
        Mockito.doReturn("quest1").when(request).getAttribute("questId");

        QuestService.startGame(request, response);

        Assertions.assertNotNull(QuestService.startGame(request, response));

    }

    @Test
    void defineNextStep() {
    }

    @Test
    void finishGame() {
    }
}