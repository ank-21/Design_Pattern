package decoratorPattern.Decorator;

import decoratorPattern.BasePizza;

public class Paneer extends ToppingsDecorator {

    BasePizza basePizza;    //has-a relationship
    
    public Paneer(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return this.basePizza.cost() + 75;
    }
}
