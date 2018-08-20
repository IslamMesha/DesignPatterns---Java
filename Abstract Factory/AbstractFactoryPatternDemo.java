/**
 * AbstractFactoryPatternDemo
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape circlShape = shapeFactory.getShape("CIRCLE");
        circlShape.draw();

        Shape rectangleShape = shapeFactory.getShape("RECTANGLE");

        rectangleShape.draw();

        Shape squareShape = shapeFactory.getShape("SQUARE");

        squareShape.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color redColor = colorFactory.getColor("RED");

        redColor.fill();

        Color greenColor = colorFactory.getColor("Green");

        greenColor.fill();

        Color blueColor = colorFactory.getColor("BLUE");

        blueColor.fill();
    }
}