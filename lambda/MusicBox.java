package lambda;



public class MusicBox {

    public MusicBox playRecord(Record record){
        record.play();
        System.out.println(record.i);
        return this;
    }

    public MusicBox playAdd(Advertisement add){
        int count = 3;
        add.playAdd(count);
        return this;
    }

    public MusicBox payForMusic(Payment payment){
        int price = 10;
        int rest = payment.pay(price);
        if(rest < 0){
            System.out.println("Pay more $" + Math.abs(rest));
        }else {
            System.out.println("Rest is $" + rest);
        }
        return this;
    }

}

@FunctionalInterface
interface Record{
    int i = 0;
    void play();
}

@FunctionalInterface
interface Advertisement{
    void playAdd(int count);
}

interface Payment{
    int pay(int amount);
}