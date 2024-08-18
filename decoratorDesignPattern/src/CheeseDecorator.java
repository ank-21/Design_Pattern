public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(BasePizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + " along with cheese toppings";
    }

    @Override
    public int getCost() {
        return decoratedPizza.getCost() + 50;
    }
}
