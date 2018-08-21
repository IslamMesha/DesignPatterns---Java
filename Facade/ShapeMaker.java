/**
 * ShapeMaker
 */
public class ShapeMaker {

    private Shape circlShape;
    private Shape rectangleShape;
    private Shape squareShape;

    public ShapeMaker() {
        circlShape = new Circle();
        rectangleShape = new Rectangle();
        squareShape = new Square();
    };

    public void drawCircle() {
        circlShape.draw();
    };

    public void drawRectangle() {
        rectangleShape.draw();
    };

    public void drawSqaure() {
        squareShape.draw();
    };
}