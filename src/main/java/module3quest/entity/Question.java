package module3quest.entity;

import java.util.HashSet;

public class Question {
    private String text;
    private HashSet<String> nextAnswersId;

    public Question(String text, HashSet<String> nextAnswersId) {
        this.text = text;
        this.nextAnswersId = nextAnswersId;
    }

    public String getText() {
        return text;
    }

    public HashSet<String> getNextAnswersId() {
        return nextAnswersId;
    }

}