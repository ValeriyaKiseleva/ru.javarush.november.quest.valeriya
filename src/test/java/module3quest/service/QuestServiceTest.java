package module3quest.service;

import module3quest.entity.Quest;
import module3quest.repository.QuestRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockitoSession;
import static org.mockito.Mockito.when;

class QuestServiceTest {

//    @Test
//    void startGameGetQuest() throws ServletException, IOException {
//        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
//        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
//        when(request.getSession()).thenReturn(Mockito.mock(HttpSession.class));
//
//        //request.getSession().setAttribute("questId","quest1");
//
//
//
//
//        //Mockito.when(session.getAttribute("questId")).thenReturn("quest1");
//        //Mockito.when(request.getAttribute("questionText")).thenReturn("someText");
//        //Mockito.when(request.getSession().getAttribute("questId")).thenReturn("quest1");
//
//        //HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
//       //Mockito.when(request.getSession().getAttribute("questId")).thenReturn("quest1");
//
//        //QuestService.startGame(request,response);
//
//        //assertNotNull(request.getSession());
//        //Assertions.assertEquals("quest1", session.getAttribute("questId"));
//        //Assertions.assertEquals("someText", request.getAttribute("questionText"));
//
//
//
//        //QuestService.startGame(request, response);
//        //request.getAttribute("questId");
//
//        //Assertions.assertEquals("quest1", request.getSession().getAttribute("questId"));
//    }

    @Test
    void startGameGetQuest() throws ServletException, IOException {
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpSession session = Mockito.mock(HttpSession.class);
        session.setAttribute("questId", "quest1");
        //when(request.getSession()).thenReturn(session);

        //Mockito.doReturn("quest1").when(request.getSession().getAttribute("questID")).getClass();

        Mockito.doReturn("quest1").when(request).getAttribute("questId");
        System.out.println(request.getAttribute("questId"));

        //System.out.println(session.getAttribute( "questId" ));

        //Quest quest = Mockito.mock(Quest.class);
        //when(quest.getFirstQuestion())
        Quest quest = QuestRepository.getQuestById("quest1");
        //System.out.println(quest.getFirstQuestion().getText());

        //when(QuestRepository.getQuestById("quest2")).thenReturn(quest);

        //QuestService.startGame(request, response);
        //request.setAttribute("name", "name");
    }

    @Test
    void startGameGetQuest2() throws ServletException, IOException {
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        RequestDispatcher requestDispatcher = Mockito.mock(RequestDispatcher.class);

        Mockito.doReturn("quest1").when(request).getAttribute("questId");
        System.out.println(request.getAttribute("questId"));

        when(request.getRequestDispatcher("quest.jsp")).thenReturn(requestDispatcher);


        System.out.println(request.getAttribute("questionText"));


    }

    @Test
    void defineNextStep() {
    }

    @Test
    void finishGame() {
    }
}