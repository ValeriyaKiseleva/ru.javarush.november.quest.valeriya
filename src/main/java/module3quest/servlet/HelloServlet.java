package module3quest.servlet;
import module3quest.repository.*;
import module3quest.service.QuestService;
import module3quest.service.UserInit;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet(name = "helloServlet", value = "/start")
public class HelloServlet extends HttpServlet {


    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("firstName");

        HttpSession session = request.getSession();
        String sessionID = session.getId();

        session.setAttribute("name", userName);

        response.setContentType("text/html;charset=utf-8");

        userInit(sessionID, userName);
        questInit();

        QuestService.startGame(request, response);
    }



    private void userInit(String sessionId, String userName) throws ServletException {
        UserInit.addUser(sessionId, userName);

    }

    private void questInit() {
        new QuestionRepository().questQuestionInit();
        new CompletionRepository().questCompletionInit();
        new AnswerRepository().questAnswerInit();

    }


}