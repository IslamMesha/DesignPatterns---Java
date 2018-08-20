/**
 * DecoratorPatternDemo
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Shape circlShape = new Circle();
        Shape redCircleShape = new RedShapeDecorator(new Circle());
        Shape redRectangleShape = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circlShape.draw();

        System.out.println("\nCircle of red border");
        redCircleShape.draw();

        System.out.println("\nRectangle of red border");
        redRectangleShape.draw();
    };
}