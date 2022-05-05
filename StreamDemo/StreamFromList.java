package StreamDemo;


import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFromList {
    public static void main(String[] args) {

        //first ex:

        List.of(new MyBean("1", 1), new MyBean("2", 2), new MyBean("10", 10))
                .stream()
                .filter(myBean -> myBean.getI1() > 1)
                .forEach(System.out::println);

        //second ex:
        System.out.println();

        List<MyBean> list1 = List.of(new MyBean("1", 1), new MyBean("2", 2), new MyBean("10", 10));
        Stream<MyBean> myStream = list1.stream();
        myStream = myStream.filter(myBean -> myBean.getI1() > 1);  //boolean test(T t)
        List<MyBean> myBeans = myStream.collect(Collectors.toList());
        System.out.println(myBeans);

        //third ex:
        System.out.println();

        MyBean[] myBeans1 = {new MyBean("1", 1), new MyBean("2", 2)};
        Arrays.stream(myBeans1)
                .peek(myBean ->myBean.setI1(myBean.getI1() * 2))
                .map(StreamFromList::calculateSum)
                .forEach(System.out::println);
    }

    private static YourBean calculateSum(MyBean myBean){

        int i2 = 0;

        try {
            i2 = Integer.parseInt(myBean.getS1());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        return new YourBean(myBean.getI1() + i2);
    }

}

class MyBean{
    private String s1;
    private Integer i1;

    public MyBean(String s1, Integer i1) {
        this.s1 = s1;
        this.i1 = i1;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public Integer getI1() {
        return i1;
    }

    public void setI1(Integer i1) {
        this.i1 = i1;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "s1='" + s1 + '\'' +
                ", i1=" + i1 +
                '}';
    }
}

class YourBean {

    private int sum;

    public YourBean(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "YourBean{" +
                "sum=" + sum +
                '}';
    }
}