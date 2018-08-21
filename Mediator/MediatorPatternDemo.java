/**
 * MediatorPatternDemo
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {

        User robert = new User("Robert");
        User john = new User("john");

        robert.sendMessage("How are you, John?");
        john.sendMessage("I am fine.");
    };
}