package generics;

public class Main {
    public static void main(String[] args) {
        String s = "some value";

        OldBox oldBox = new OldBox();
        //oldBox.setValue(100);//Second problem ошибка во время runtime

        String s2 = (String)oldBox.getValue();//First problem

        NewBox<String> newBox =new NewBox<>();
        //newBox.setValue(100);//Second problem показывает неправильный тип сразу
        String s3 = newBox.getValue();
    }
}
