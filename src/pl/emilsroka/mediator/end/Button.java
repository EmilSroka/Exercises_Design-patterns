package pl.emilsroka.mediator.end;

public class Button extends UIControl {
    private boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        System.out.println("(Button) Enable: " + enabled);
        isEnabled = enabled;
    }
}
