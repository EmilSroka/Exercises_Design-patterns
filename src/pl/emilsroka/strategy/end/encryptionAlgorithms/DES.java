package pl.emilsroka.strategy.end.encryptionAlgorithms;

public class DES implements EncryptionAlgorithm {
    @Override
    public String encrypt(String message) {
        System.out.println("Encrypting message using DES");
        return message;
    }
}
