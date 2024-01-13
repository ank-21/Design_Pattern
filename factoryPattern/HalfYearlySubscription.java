package factoryPattern;

public class HalfYearlySubscription extends Subscription {
    
    @Override
    public void getCost(){
        rate = 800;
    }
}
