package strategyPattern;

public class Client {
    public static void main(String[] args) {
        
        Vehicle vehicle1 = new SportsVehicle();
        vehicle1.drive();

        /*for another client let's say I want to use someother vehicle, then I just need to add another class which will
         extend the Vehicle class. If the drive strategy would be one of Normal Drive Strategy or SportsDriveStrategy then
         we will use those
        */
        Vehicle vehicle2 = new RandomVehicle();
        vehicle2.drive();
    }
}
