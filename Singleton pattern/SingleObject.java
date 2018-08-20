/**
 * SingleObject
 */
public class SingleObject {

    private SingleObject() {
    };

    private static SingleObject singleObject = new SingleObject();

    public static SingleObject getSingleObject() {
        return singleObject;
    };

    public void showMessage() {
        System.out.println("Hello, Design Patterns!!");
    };

}