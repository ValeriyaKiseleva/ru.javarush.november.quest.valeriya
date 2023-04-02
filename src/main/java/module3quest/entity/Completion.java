package module3quest.entity;

public class Completion {
    private boolean isWin;
    private String text;

    public Completion(boolean isWin, String text) {
        this.isWin = isWin;
        this.text = text;
    }

    public boolean getIsWin() {
        return isWin;
    }

    public String getText() {
        return text;
    }
}
