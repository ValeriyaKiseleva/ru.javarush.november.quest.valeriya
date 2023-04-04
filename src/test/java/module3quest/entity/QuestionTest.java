package module3quest.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    @Test
    void getText() {
        Question question = new Question("SomeText", new HashSet<>(Arrays.asList("ans3", "ans4")));
        Assertions.assertEquals("SomeText", question.getText());
    }

    @Test
    void getNextAnswersId() {
        Question question = new Question("SomeText", new HashSet<>(Arrays.asList("ans3", "ans4")));
        HashSet<String> nextAnswersId = new HashSet<>(Arrays.asList("ans3", "ans4"));
        Assertions.assertEquals(nextAnswersId, question.getNextAnswersId());
    }
}