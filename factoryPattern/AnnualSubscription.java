package factoryPattern;

public class AnnualSubscription extends Subscription {
    
    @Override
    public void getCost(){
        rate = 1200;
    }
}
