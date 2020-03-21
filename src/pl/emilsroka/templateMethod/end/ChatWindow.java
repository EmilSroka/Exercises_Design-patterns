package pl.emilsroka.templateMethod.end;

public class ChatWindow extends Window {
    @Override
    protected void beforeClose() {
        System.out.println("Disconnecting from the server...");
    }
}
