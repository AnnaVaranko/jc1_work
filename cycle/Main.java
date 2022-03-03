package cycle;

public class Main {
    static void tryWhile(){
        int i = 0;
        while(i<5){
            System.out.println("i = " + i);
            i++;
        }
    }
    static void tryDoWhile(){
        int i = 5;
        do{
            System.out.println("i = " + i);
            i++;
        } while (i < 5);
    }
    static void tryFor(){
        for(int i = 0; i < 5; i ++) {
            System.out.println("i = " + i);
            i++;
        }
    }

    static double average(int[] numbers){
        int sum = 0;
        for(int i = 0; i< numbers.length; i++){
            System.out.print(numbers[i] + " ");
            sum += numbers[i];
        }
        System.out.println("sum = " + sum);
        double result = (double)sum / numbers.length;
        return result;
    }

    public static void main(String[] args) {
        int[] test1 = {1,2};
        System.out.println(average(test1));

        int[] test2 = new int[3];
        System.out.println(average(test2));
    }
}
