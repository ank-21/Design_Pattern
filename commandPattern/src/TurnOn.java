public class TurnOn implements ICommand{

    private Device device;
    public TurnOn(Device device){
        this.device = device;
    }
    @Override
    public void execute() {
        //any change in code in future for turning on the device will be done here
        device.turnOn();
    }

    @Override
    public void undo() {
        device.turnOff();
    }
}
