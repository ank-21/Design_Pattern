package decoratorPattern.Decorator;

import decoratorPattern.BasePizza;

public class Mushroom extends ToppingsDecorator {

    //I need a reference of basePizza
    BasePizza basePizza;    //need to define it here as mushroom is a wrapper above base Pizza, can do it but then have to use super
    
    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost(){
        return this.basePizza.cost() + 50;
    }
}
