package module3quest.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class AnswerRepositoryTest {

    @ParameterizedTest
    @ValueSource(strings ={"ans1","ans2","ans3"})
    void getAnswerByIdNotNull(String answerId) {
        Assertions.assertNotNull(AnswerRepository.getAnswerById(answerId));
    }
}