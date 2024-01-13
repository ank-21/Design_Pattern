package strategyPattern.Strategy;

public class RandomStrategy implements DriveStrategy {

    @Override
    public void drive(){
        System.out.println("Random drive strategy");
    }
}
