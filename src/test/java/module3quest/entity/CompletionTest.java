package module3quest.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompletionTest {

    @Test
    void getIsWin() {
        Completion completion = new Completion(true, "Text");
        Assertions.assertTrue(completion.getIsWin());
    }

    @Test
    void getText() {
        Completion completion = new Completion(true, "Text");
        Assertions.assertEquals("Text", completion.getText());
    }
}