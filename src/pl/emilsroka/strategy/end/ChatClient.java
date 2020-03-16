package pl.emilsroka.strategy.end;

import pl.emilsroka.strategy.end.encryptionAlgorithms.EncryptionAlgorithm;

public class ChatClient {
    private EncryptionAlgorithm encryptionAlgorithm;

    public ChatClient(EncryptionAlgorithm encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message) {
        encryptionAlgorithm.encrypt(message);
        System.out.println("Sending the encrypted message...");
    }
}
