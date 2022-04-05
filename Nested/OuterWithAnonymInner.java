package Nested;

public class OuterWithAnonymInner {

    public void buildAnonymInner(){
        getSomeInterface(new SomeInterface() {
            @Override
            public void doSomething() {
                System.out.println("Do something #1");
            }
        });
    }

    private void getSomeInterface(SomeInterface someInterface){
        someInterface.doSomething();
    }

    public static void main(String[] args) {
        new OuterWithAnonymInner().buildAnonymInner();
    }
}



interface SomeInterface{
    void doSomething();
}