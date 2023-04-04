package module3quest.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CompletionRepositoryTest {

    @ParameterizedTest
    @ValueSource(strings ={"cmp1","cmp2","cmp3","cmp4"})
    void getCompletionByIdNotNull(String completionID) {
        Assertions.assertNotNull(CompletionRepository.getCompletionById(completionID));
    }
}