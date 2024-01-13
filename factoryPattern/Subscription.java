package factoryPattern;

public abstract class Subscription {
    
    protected int rate;
    public abstract void getCost();

    public void calculateBill(){
        System.out.println("The cost is " + rate);
    }
}
