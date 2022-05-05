package StreamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AverageStream {

    public static Double averageInt(List<Integer> numbers){
        return numbers
                .stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }

    public static void main(String[] args) {
        System.out.println(averageInt(List.of(1, 2)));
        System.out.println(averageInt(List.of()));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(null);
        list.add(4); 
        System.out.println(averageInt(list));
    }
}
