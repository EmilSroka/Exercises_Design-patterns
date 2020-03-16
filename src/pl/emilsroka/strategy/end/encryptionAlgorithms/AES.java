package pl.emilsroka.strategy.end.encryptionAlgorithms;

public class AES implements EncryptionAlgorithm {

    @Override
    public String encrypt(String message) {
        System.out.println("Encrypting message using AES");
        return message;
    }
}
