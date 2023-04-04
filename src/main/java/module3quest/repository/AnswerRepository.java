package module3quest.repository;

import module3quest.entity.*;

import java.util.HashMap;

public class AnswerRepository {
    private HashMap<String, Answer> questAnswers = new HashMap<>();

    private static HashMap<String, Answer> answersBD = new HashMap<>() {{
        put("ans1", new Answer<>("Принять вызов", QuestionRepository.getQuestionById("qs2")));
        put("ans2", new Answer<>("Отклонить вызов", CompletionRepository.getCompletionById("cmp1")));
        put("ans3", new Answer<>("Подняться на мостик", QuestionRepository.getQuestionById("qs3")));
        put("ans4", new Answer<>("Отказаться подниматься на мостик", CompletionRepository.getCompletionById("cmp2")));
        put("ans5", new Answer<>("Рассказать правду о себе", CompletionRepository.getCompletionById("cmp4")));
        put("ans6", new Answer<>("Солгать о себе", CompletionRepository.getCompletionById("cmp3")));
    }};

    public static Answer getAnswerById(String answerId) {
        return answersBD.get(answerId);
    }

}


