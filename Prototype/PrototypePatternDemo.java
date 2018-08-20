public class PrototypePatternDemo {
    public static void main(String[] args) {
        
        ShapeCache.loadCache();

        Shape circleClonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + circleClonedShape.getType());

        Shape squareClonedShape = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + squareClonedShape.getType());

        Shape rectangleClonedShape = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + rectangleClonedShape.getType());
    }
}