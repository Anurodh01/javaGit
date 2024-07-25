package designpatterns.strategy;

public class AESEncryption implements Encryptor{
    @Override
    public String encryptFile() {
        return "Applying AES encryption";
    }
}
