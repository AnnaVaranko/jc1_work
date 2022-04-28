package lambda;

public class Client {

    private MusicBox musicBox;

    public Client() {
        this.musicBox = new MusicBox();
    }

//    public void selectMusic(){
//        Record record = () -> System.out.println("Madonna - Frozen");
//        musicBox.playRecord(record);
//
//        musicBox.playRecord(
//                () -> System.out.println("Metallica - Sad but True")
//        );
//
//        musicBox.playAdd((x) -> {
//            for(int i = 1; i <= x; i++){
//
//                System.out.println("Advertisement is playing " + i);
//            }
//        });
//
//
//        int moneyInPocket = 2;
//        musicBox.payForMusic((x) ->
//        {
//            System.out.println("Price: $" + x);
//            int res = moneyInPocket - x;
//            System.out.println("Pay: $" + moneyInPocket);
//            return  res;
//        });
//    }

    private void advertisement(int x){
        for (int i = 1; i <= x; i++) {
            System.out.println("Advertisement is playing " + i);
        }
    }

    public void selectMusic(int moneyInPocket) {

        musicBox
                .playRecord(() -> System.out.println("Madonna - Frozen"))
                .playRecord(() -> System.out.println("Metallica - Sad but True"))
                .playAdd(this::advertisement)
                .payForMusic((x) ->
                {
                    System.out.println("Price: $" + x);
                    int res = moneyInPocket - x;
                    System.out.println("Pay: $" + moneyInPocket);
                    return res;
                });
    }

    public static void main(String[] args) {
        new Client().selectMusic(12);
    }
}
