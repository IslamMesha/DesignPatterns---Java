
public class FactoryPatternDemo {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circlShape = shapeFactory.getShape("CIRCLE");
        circlShape.draw();

        Shape rectangleShape = shapeFactory.getShape("RECTANGLE");
        rectangleShape.draw();

        Shape squareShape = shapeFactory.getShape("SQUARE");
        squareShape.draw();
    }
}