import java.util.Date;

/**
 * ChatRoom
 */
public class ChatRoom {

    public static void showMessages(User user, String message) {
        System.out.println(new Date().toString() + "[" + user.getName() + "] : " + message);
    }
}