package module3quest.service;

import module3quest.entity.*;
import module3quest.repository.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class QuestService {

    public static void startGame(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String questId = (String) request.getSession().getAttribute("questId");
        Quest quest = QuestRepository.getQuestById(questId);

        Question firstQuestion = quest.getFirstQuestion();
        request = getOutputValues(request, firstQuestion);
        request.getRequestDispatcher("quest.jsp").forward(request, response);
    }

    private static HttpServletRequest getOutputValues(HttpServletRequest request, Question question) {
        String questId = (String) request.getSession().getAttribute("questId");
        Quest quest = QuestRepository.getQuestById(questId);

        request.setAttribute("questionText", question.getText());
        HashSet<String> currentAnswerOptionsId = question.getNextAnswersId();
        HashMap<String, String> currentAnswersText = new HashMap<>();
        for (String answerId : currentAnswerOptionsId) {
            currentAnswersText.put(answerId, quest.getAnswerById(answerId).getText());
        }
        request.setAttribute("answersTextMap", currentAnswersText);
        return request;
    }

    public static void defineNextStep(HttpServletRequest request, HttpServletResponse response)
                                           throws ServletException, IOException {

        String questId = (String) request.getSession().getAttribute("questId");
        Quest quest = QuestRepository.getQuestById(questId);

        Answer currentAnswer = quest.getAnswerById((String) request.getAttribute("currentAnswer"));

        if (currentAnswer.getResult() instanceof Question) {
            request = getOutputValues(request, (Question) currentAnswer.getResult());
            request.getRequestDispatcher("quest.jsp").forward(request, response);
        } else if (currentAnswer.getResult() instanceof Completion) {
            finishGame(request, response, (Completion) currentAnswer.getResult());
        }
    }

    public static void finishGame(HttpServletRequest request, HttpServletResponse response, Completion completion) throws ServletException, IOException {
        User user = UserRepository.getUserById((Integer) request.getSession().getAttribute("userId"));
        if (completion.getIsWin()) {
            user.gameIsWon();
            request.getSession().setAttribute("wonGames", user.getWonGames());
            request.setAttribute("completionTitle", CompletionRepository.getTitleGameIsWon());
        } else {
            user.gameIsLost();
            request.getSession().setAttribute("lostGames", user.getLostGames());
            request.setAttribute("completionTitle", CompletionRepository.getTitleGameIsLost());
        }

        request.setAttribute("completionText", completion.getText());

        request.getRequestDispatcher("gameover.jsp").forward(request, response);
    }


}

