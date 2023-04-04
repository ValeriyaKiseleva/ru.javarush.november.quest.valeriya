package module3quest.repository;

import module3quest.entity.Question;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class QuestionRepositoryTest {

    @ParameterizedTest
    @ValueSource(strings ={"qs1","qs2","qs3"})
    void getQuestionByIdNotNull(String questionId) {

        Assertions.assertNotNull(QuestionRepository.getQuestionById(questionId));
    }


    @Test
    void getQuestionById() {
        HashMap<String, Question> questionMockBD = Mockito.mock(HashMap.class);
        Question question = new Question("Вопрос из репозитория №1", new HashSet<String>(Arrays.asList("ans1", "ans2")));
        questionMockBD.put("qs1", question);


         Assertions.assertEquals(question.getText(), QuestionRepository.getQuestionById("qs1").getText());
    }


}