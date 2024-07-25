package designpatterns.strategy;

public class Main {
    public static void main(String[] args) {
        File file = new File("itr.pdf");
        file.encrypt(Encryptor.aesEncryptor);
        //as now onwards no need of concrete implementations of AESEncryption and RSAEncryption classes
    }
}
