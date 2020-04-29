package pl.emilsroka.mediator.end;

public class CheckBox extends UIControl {
    private boolean isChecked;

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        System.out.println("(CheckBox) State set: " + checked);
        isChecked = checked;
        notifySubscribers();
    }
}
