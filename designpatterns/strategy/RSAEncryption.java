package designpatterns.strategy;

public class RSAEncryption implements Encryptor{
    @Override
    public String encryptFile() {
        return "Applying RSA encryption";
    }
}
