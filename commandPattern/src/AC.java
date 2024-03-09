public class AC implements Device{

    @Override
    public void turnOn(){
        System.out.println("AC is now on!");
    }

    @Override
    public void turnOff(){
        System.out.println("AC is turn off!");
    }

    public void changeTemp(){
        System.out.println("Temperature changed!");
    }
}
