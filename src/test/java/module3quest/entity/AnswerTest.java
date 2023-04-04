package module3quest.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class AnswerTest {

    @Test
    void getText() {
        Answer answer = new Answer("SomeText", new Object());
        Assertions.assertEquals("SomeText", answer.getText());
    }

    @Test
    void getResultNotNull() {
        Answer answer = new Answer("SomeText", new Object());
        Assertions.assertNotNull(answer.getResult());
    }
}