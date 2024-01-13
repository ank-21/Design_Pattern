package strategyPattern;

import strategyPattern.Strategy.RandomStrategy;

public class RandomVehicle extends Vehicle {
    RandomVehicle(){
        super( new RandomStrategy());
    }
}
