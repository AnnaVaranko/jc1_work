package oop;

public abstract class  Machine {
    String name;

    Machine(){
        this("No name");
        System.out.println("No name defined");
    }

    public Machine(String name){
        this.name = name;
        System.out.println("Set name " + name);
    }

    public abstract void work();

    public void stop(){
        this.stop(0);
    }

    public void stop(int sec){
        System.out.println("Machine stopped in " + sec + " sec.");
    }
}
