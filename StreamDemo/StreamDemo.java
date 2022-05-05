package StreamDemo;

import java.util.Random;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        long count = Stream
                .generate(() -> new Random().nextInt(256))
                .limit(100)
                .filter(intValue -> intValue != 0)
                .map(intValue -> (char) intValue.intValue())
                .peek(System.out::print)
                .count();
        System.out.println(count);
    }
}
