package designpatterns.strategy;

public class File {
    private String fileName;
    private Encryptor encryptor;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void encrypt(Encryptor encryptor){
        System.out.println(encryptor.encryptFile()+" to "+ fileName);
    }
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
