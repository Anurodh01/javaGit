package codes;
public class Code5 extends Thread {
    public static void main(String[] args) {
        Thread thread1= new Thread(new Code5());
        Thread thread2= new Thread(new Code5());
        thread1.setName("POLO-1");
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setName("POLO-2");
        thread2.setPriority(1);
        thread2.start();
        thread1.start();
    }
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("Thread: "+Thread.currentThread().getName()+": "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
                System.out.println(e);
            }
        }
    }

}
