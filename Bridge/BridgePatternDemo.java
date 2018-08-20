/**
 * BridgePatternDemo
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircleShape = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircleShape = new Circle(100, 100, 10, new GreenCircle());
        redCircleShape.draw();
        greenCircleShape.draw();
    }
}