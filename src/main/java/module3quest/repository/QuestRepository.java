package module3quest.repository;

import module3quest.entity.Quest;

import java.util.HashMap;

public class QuestRepository {
    private static HashMap<String, Quest> questHashMap = new HashMap < String, Quest>() {{
            put("quest1", new Quest("qs1"));
    }};

    public static Quest getQuestById(String questId) {
        return questHashMap.get(questId);
    }
}
