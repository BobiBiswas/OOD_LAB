public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getshape(String shapeType) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
   
