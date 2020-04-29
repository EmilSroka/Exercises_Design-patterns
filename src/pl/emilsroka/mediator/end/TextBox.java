package pl.emilsroka.mediator.end;

public class TextBox extends UIControl {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        System.out.println("(TextBox) Content set: " + content);
        this.content = content;
        notifySubscribers();
    }
}
