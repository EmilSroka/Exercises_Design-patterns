package pl.emilsroka.templateMethod.end;

public class Window {
    final public void close() {
        beforeClose();
        System.out.println("Removing the window from the screen");
        afterClose();
    }

    protected void afterClose(){}
    protected void beforeClose(){}
}
