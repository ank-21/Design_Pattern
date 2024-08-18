public class client {
    public static void main(String[] args) {
        BasePizza pizza = new PlainPizza();
        // Here this is calling the Plain pizza class hence all the values and desc are of plain pizza and \
        // now when we call the decorator class by passing this pizza argument, it will use them.

        // The BasePizza decoratedPizza will be assigned this value

        // Now for the base we can have so many classes for different base structure and then the added features can be provided by the decorator class

        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

        pizza = new PaneerDecorator(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
