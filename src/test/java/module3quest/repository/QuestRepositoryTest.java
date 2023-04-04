package module3quest.repository;

import module3quest.entity.Quest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class QuestRepositoryTest {

    @Test
    void getQuestById() {
        Assertions.assertNotNull(QuestRepository.getQuestById("quest1"));
    }
}