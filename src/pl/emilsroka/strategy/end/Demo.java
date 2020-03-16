package pl.emilsroka.strategy.end;

import pl.emilsroka.strategy.end.encryptionAlgorithms.DES;

public class Demo {
    public static void main(String[] args){
        show();
    }

    public static void show() {
        var client = new ChatClient(new DES());
        client.send("Hello World");
    }
}
