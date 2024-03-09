public class Circle implements Shape{

    private String colour;

    public Circle(String colour){
        this.colour = colour;
    }

    @Override
    public Shape clone(){
        return new Circle(this.colour);
    }

    @Override
    public void draw(){
        System.out.println("Drawing a " + colour + " colour Circle");
    }
}
