/**
 * ProxyPatternDemo
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {

        // Image image = new ProxyImage("islam.java");
        Image image = new ProxyImage(args[0]);

        image.display();
        System.out.println("===============");
        image.display();
    };
}