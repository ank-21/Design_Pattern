public class PlainPizza implements BasePizza{
    @Override
    public String getDescription() {
        return "A plain pizza";
    }

    @Override
    public int getCost() {
        return 50;
    }
}
