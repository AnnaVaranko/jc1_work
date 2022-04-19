package thread;

public class Counter {
    private int userCount = 0;

    public synchronized void increment(){
        userCount++;
    }

    public synchronized int getUserCount(){
        return userCount;
    }

    private static Counter counter;

    public static Counter getCounter(){
        if(counter == null){
            counter = new Counter();
        }
        return counter;
    }
}
