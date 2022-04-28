package lambda;

public class MethodCollection {

    public static void doBobble(Bubbleable bubbleable){
        Bubble bubble = bubbleable.get();
        System.out.println(bubble);
    }

    public static void main(String[] args) {
        int x = 0;

        while (x < 10) {
            doBobble(Bubble::new);
            x++;
        }
    }
}

class Bubble {}

@FunctionalInterface
interface Bubbleable {Bubble get();}