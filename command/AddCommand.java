package command;

public class AddCommand extends Command{

    private ArrayOperation ao;

    public AddCommand(ArrayOperation ao) {
        this.ao = ao;
    }

    @Override
    void execute() {
        ao.sum();
    }
}
