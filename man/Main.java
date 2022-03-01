package man;

import java.util.ArrayList;

public class Main {

    static ArrayList list = new ArrayList();

    public static void main(String[] args) throws InterruptedException {
        Man myMan2;
        Man myMan = new Man();
        System.out.println(myMan.getAge());

        myMan2 = myMan;
        System.out.println(myMan2.getAge());

        myMan2.age = 25;
        System.out.println(myMan2.getAge());
        System.out.println(myMan.getAge());
        Thread.sleep(10_000);
        for(int i =0; i< 100_000_000; i++){
            list.add(new Man(i));
            if(i>1_000) Thread.sleep(1_000);
            //Thread.sleep(1);
        }
    }
}
