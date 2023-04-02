package module3quest.repository;

import module3quest.entity.*;

import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;


public class AnswerRepository {
    private static HashMap<String, Answer> questAnswers;

    public void questAnswerInit() {
        questAnswers = new HashMap<>();
        questAnswers.put("ans1", new Answer<>("Ответ №1", QuestionRepository.getQuestionById("qs2")));
        questAnswers.put("ans2", new Answer<>("Ответ №2", CompletionRepository.getCompletionById("cmp1")));
        questAnswers.put("ans3", new Answer<>("Ответ №3", QuestionRepository.getQuestionById("qs3")));
        questAnswers.put("ans4", new Answer<>("Ответ №4", CompletionRepository.getCompletionById("cmp2")));
        questAnswers.put("ans5", new Answer<>("Ответ №5", CompletionRepository.getCompletionById("cmp4")));
        questAnswers.put("ans6", new Answer<>("Ответ №6", CompletionRepository.getCompletionById("cmp3")));
    }


    public static Answer getAnswerById(String answerId) {
        return questAnswers.get(answerId);
    }
}


