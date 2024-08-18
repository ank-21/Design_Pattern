public class PizzaDecorator implements BasePizza{
    BasePizza decoratedPizza;

    public PizzaDecorator(BasePizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public String getDescription() {
        return this.decoratedPizza.getDescription();
    }

    @Override
    public int getCost() {
        return this.decoratedPizza.getCost();
    }
}
