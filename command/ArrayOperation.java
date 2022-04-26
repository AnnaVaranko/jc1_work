package command;

public class ArrayOperation {

    private Integer[] mass;

    public ArrayOperation(Integer[] mass) {
        this.mass = mass;
    }

    public  void product(){
        int result = 1;

        for(int m: mass){
            result *= m;
        }

        mass = new Integer[1];
        mass[0] = result;
    }

    public void sum(){
        int res = 0;
        for(int m: mass){
            res += m;
        }
        mass = new Integer[1];
        mass[0] = res;
    }

    public Integer getResult(){

    }
}
