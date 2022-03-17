package pattern;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Callable;

public class PatternDemo {
    public static void main(String[] args) {
        String s1 = "12345.56";
        System.out.println(s1.matches("\\d+\\.\\d{2}"));

        Date currentDate = new Date(0);
        System.out.println("Current date: " + currentDate);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        OrderStatus initialStatus = OrderStatus.PAID;
        System.out.println(initialStatus.getPrice());
        System.out.println(initialStatus.name());
        System.out.println(initialStatus.ordinal());

        }
    }
