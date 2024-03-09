public class ChangeChannel implements ICommand{
    private TV tv;

    public ChangeChannel(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.changeChannel();
    }

    @Override
    public void undo() {
        this.tv.changeChannel();
    }
}
