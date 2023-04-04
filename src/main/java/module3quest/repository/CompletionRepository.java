package module3quest.repository;

import module3quest.entity.Completion;

import java.util.HashMap;


public class CompletionRepository {
    private HashMap<String, Completion> questCompletions = new HashMap<>();
    private final static String GAME_IS_WON = "ПОБЕДА !";
    private final static String GAME_IS_LOST = "ПОРАЖЕНИЕ !";

    public static String getTitleGameIsWon() {
        return GAME_IS_WON;
    }

    public static String getTitleGameIsLost() {
        return GAME_IS_LOST;
    }

    private static HashMap<String, Completion> completionsBD = new HashMap<>() {{
        put("cmp1", new Completion(false, "Ты отклонил вызов."));
        put("cmp2", new Completion(false, "Ты не пошел на переговоры."));
        put("cmp3", new Completion(false, "Твою ложь разоблачили."));
        put("cmp4", new Completion(true, "Тебя вернули домой!"));
    }};

    public static Completion getCompletionById(String completionId) {
        return completionsBD.get(completionId);
    }
}
