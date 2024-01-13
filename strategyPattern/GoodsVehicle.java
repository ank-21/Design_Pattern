package strategyPattern;

import strategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    GoodsVehicle(){
        super( new NormalDriveStrategy());
    }
}
