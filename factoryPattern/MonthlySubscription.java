package factoryPattern;

public class MonthlySubscription extends Subscription {
    
    @Override
    public void getCost(){
        rate = 200;
    }
}
