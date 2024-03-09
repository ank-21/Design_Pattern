public class ShapeClient {
    public static void main(String [] args){
        Circle prototypeObj = new Circle("Red");
        Circle obj2 = (Circle) prototypeObj.clone();
        obj2.draw();
        //here we didn't need to create a new object for obj2 from scratch
    }
}
