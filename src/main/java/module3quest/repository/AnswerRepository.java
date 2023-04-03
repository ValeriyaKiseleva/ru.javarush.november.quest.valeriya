package module3quest.repository;

import module3quest.entity.*;

import java.util.HashMap;

public class AnswerRepository {
    private HashMap<String, Answer> questAnswers = new HashMap<>();

    private static HashMap<String, Answer> answersBD = new HashMap<>() {{
        put("ans1", new Answer<>("Ответ №1", QuestionRepository.getQuestionById("qs2")));
        put("ans2", new Answer<>("Ответ №2", CompletionRepository.getCompletionById("cmp1")));
        put("ans3", new Answer<>("Ответ №3", QuestionRepository.getQuestionById("qs3")));
        put("ans4", new Answer<>("Ответ №4", CompletionRepository.getCompletionById("cmp2")));
        put("ans5", new Answer<>("Ответ №5", CompletionRepository.getCompletionById("cmp4")));
        put("ans6", new Answer<>("Ответ №6", CompletionRepository.getCompletionById("cmp3")));
    }};

    public static Answer getAnswerById(String answerId) {
        return answersBD.get(answerId);
    }

}


