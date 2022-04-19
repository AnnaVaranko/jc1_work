package thread;

public class UserCounter extends Thread{
    @Override
    public void run() {
        Counter.getCounter().increment();
    }

    public static void main(String[] args) {
        try {
            int i = 0;
            while (i < 100){
                UserCounter userCounter = new UserCounter();
                userCounter.setName("userCounterThread" + i++);
                userCounter.start();
            }
            System.out.println("User count: " + Counter.getCounter().getUserCount());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
