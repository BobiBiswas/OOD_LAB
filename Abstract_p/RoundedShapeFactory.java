public class RoundedShapeFactory extends AbstractFactory {
    @Override
    Shape getshape(String shapeType) {
        return null;
    }

    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }
        return null;
    }
}