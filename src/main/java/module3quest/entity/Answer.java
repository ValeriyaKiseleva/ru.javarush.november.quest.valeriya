package module3quest.entity;

public class Answer<T> {
    private String text;
    private T result;


    public Answer(String text, T result) {
        this.text = text;
        this.result = result;
    }

    public String getText() {
        return text;
    }

    public T getResult() {
        return result;
    }
}
