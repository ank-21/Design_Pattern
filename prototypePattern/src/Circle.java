public class Circle implements Shape{

    private String colour;

    public String getColour() {
        return colour;
    }

    public Circle(String colour){
        this.colour = colour;
    }

    @Override
    public Shape clone(){
        return new Circle(this.colour);
    }

    @Override
    public void draw(){
        this.colour = "green";
        System.out.println("Drawing a " + colour + " colour Circle");
    }
}
