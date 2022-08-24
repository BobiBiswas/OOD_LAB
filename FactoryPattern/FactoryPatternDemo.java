public class FactoryPatternDemo{
    public static void main(String[] args){
        shape shape1 = ShapeFactory.getShape("CIRCLE");
        shape1.draw();
        shape shape2 = ShapeFactory.getShape("SQUARE");
        shape2.draw();
        shape shape3 = ShapeFactory.getShape("RECTANGLE");
        shape3.draw();
    }
}