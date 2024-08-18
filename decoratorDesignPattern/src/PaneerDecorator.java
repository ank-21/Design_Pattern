public class PaneerDecorator extends PizzaDecorator{
    public PaneerDecorator(BasePizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + " along with paneer toppings";
    }

    @Override
    public int getCost() {
        return decoratedPizza.getCost() + 30;
    }
}
