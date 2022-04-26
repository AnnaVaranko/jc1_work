package command;

public class CommandManager {

    private Command command;

    public void setManager(Command command){
        this.command = command;
    }

    public void exec(){
        command.execute();
    }
}
