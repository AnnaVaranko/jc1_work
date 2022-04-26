package command;

import java.util.List;

public class Client {
    public static void main(String[] args) {


        Command command = new AddCommand(new ArrayOperation((Integer[]) List.of(1, 2, 3).toArray()));

        CommandManager commandManager = new CommandManager();


    }
}
