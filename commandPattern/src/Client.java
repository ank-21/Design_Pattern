public class Client {
    public static void main(String[] args){

        TV tv = new TV();
        AC ac = new AC();

        RemoteControlInvoker remote = new RemoteControlInvoker();

        ICommand turnOnACCommand = new TurnOn(ac);
        ICommand changeTempCommand = new ChangeTemp(ac);
        ICommand turnOffACCommand = new TurnOff(ac);


        remote.setCommand(turnOnACCommand);
        remote.pressButton();

        remote.setCommand(changeTempCommand);
        remote.pressButton();
        remote.undo();

        remote.setCommand(turnOffACCommand);
        remote.pressButton();
    }
}
