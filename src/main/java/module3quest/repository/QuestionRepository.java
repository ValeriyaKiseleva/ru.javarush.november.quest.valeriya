package module3quest.repository;

import module3quest.entity.Question;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class QuestionRepository {

    private static HashMap<String, Question> questionsBD = new HashMap<>() {{
            put("qs1", new Question("Вопрос из репозитория №1", new HashSet<String>(Arrays.asList("ans1", "ans2"))));
            put("qs2", new Question("Вопрос №2", new HashSet<String>(Arrays.asList("ans3", "ans4"))));
            put("qs3", new Question("Вопрос №3", new HashSet<String>(Arrays.asList("ans5", "ans6"))));
    }};

    public static Question getQuestionById(String questionId) throws NullPointerException {
        return questionsBD.get(questionId);
    }
}


