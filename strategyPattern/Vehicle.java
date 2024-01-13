package strategyPattern;

import strategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject; //creating an object of the interface and making it dynamic

    //constructor injection
    Vehicle(DriveStrategy driveObj){
        this.driveObject = driveObj;
    }

    public void drive(){
        driveObject.drive();
    }
}
