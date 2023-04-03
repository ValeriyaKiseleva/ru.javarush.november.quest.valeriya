package module3quest.servlet;

import module3quest.service.QuestService;
import module3quest.service.UserInit;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet(name = "helloServlet", value = "/start")
public class HelloServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("firstName");

        HttpSession session = request.getSession();
        session.setAttribute("questId", "quest1");
        response.setContentType("text/html;charset=utf-8");

        UserInit.addUser(session, userName);

        QuestService.startGame(request, response);
    }

}