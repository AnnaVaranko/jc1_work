public class Task15 {
    public static void primeNumber(){
        int primeNumber = 0;

        for(int i = 50; i <= 70; i++){
            int counter = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0) counter++;
                if(counter == 2){
                    System.out.println("Number is " + i);
                    primeNumber++;
                }
            }
            if(primeNumber == 2)break;
        }
    }

    public static void main(String[] args) {
        primeNumber();
    }
}
