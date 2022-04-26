package command;

public class MultiplyCommand extends Command{

    private ArrayOperation ao;

    public MultiplyCommand(ArrayOperation ao) {
        this.ao = ao;
    }

    @Override
    void execute() {
        ao.product();
    }
}
