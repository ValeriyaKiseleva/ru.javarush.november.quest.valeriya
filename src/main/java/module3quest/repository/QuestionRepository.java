package module3quest.repository;


import module3quest.entity.Question;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class QuestionRepository {

    private static HashMap<String, Question> questQuestions = new HashMap<>();

    public static Question getFirstQuestion() {
        return questQuestions.get("qs1");
    }

    public void questQuestionInit() {
        questQuestions.put("qs1", new Question("Вопрос из репозитория №1", new HashSet<String>(Arrays.asList("ans1", "ans2"))));
        questQuestions.put("qs2", new Question("Вопрос №2", new HashSet<String>(Arrays.asList("ans3", "ans4"))));
        questQuestions.put("qs3", new Question("Вопрос №3", new HashSet<String>(Arrays.asList("ans5", "ans6"))));

    }

    public static Question getQuestionById(String  questionId) {
        return questQuestions.get(questionId);
    }
}


