public class ShapeClient {
    public static void main(String [] args){
        Circle prototypeObj = new Circle("Red");
        Circle obj2 = (Circle) prototypeObj.clone();
        obj2.draw();
        System.out.println(prototypeObj.getColour()); //still in red
        System.out.println(obj2.getColour());   //will be in green

        //here we didn't need to create a new object for obj2 from scratch
    }
}
