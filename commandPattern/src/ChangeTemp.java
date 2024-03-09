public class ChangeTemp implements ICommand{
    private AC ac;

    public ChangeTemp(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.changeTemp();
    }

    @Override
    public void undo() {
        ac.changeTemp();
    }
}
