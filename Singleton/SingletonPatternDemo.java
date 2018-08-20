/**
 * SingletonPatternDemo
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {

        // The constructor SingleObject() is not visible.
        // SingleObject singleObject = new SingleObject();

        // THe Correct way to get instace of SingleObject()
        SingleObject singleObject = SingleObject.getSingleObject();

        singleObject.showMessage();
    }
}