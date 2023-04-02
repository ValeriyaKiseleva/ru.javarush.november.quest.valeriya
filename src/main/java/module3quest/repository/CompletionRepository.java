package module3quest.repository;


import module3quest.entity.Completion;

import java.util.HashMap;

public class CompletionRepository {
    private static HashMap<String, Completion> questCompletions = new HashMap<>();
    private static String gameIsWon = "ПОБЕДА !";
    private static String gameIsLost = "ПОРАЖЕНИЕ !";

    public void questCompletionInit() {
        questCompletions.put("cmp1", new Completion(false, "Loss 1"));
        questCompletions.put("cmp2", new Completion(false, "Loss 2"));
        questCompletions.put("cmp3", new Completion(false, "Loss 3"));
        questCompletions.put("cmp4", new Completion(true, "Win"));
    }


    public static Completion getCompletionById(String completionId) {
        return questCompletions.get(completionId);
    }

    public static String getTitleGameIsWon() {
        return gameIsWon;
    }

    public static String getTitleGameIsLost() {
        return gameIsLost;
    }
}
