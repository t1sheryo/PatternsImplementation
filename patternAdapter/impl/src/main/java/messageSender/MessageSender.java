package messageSender;

import model.User;

public class MessageSender {
    public void sendMessage(User user, String message){
        System.out.println("Sending a message to " + user.name() + "; Message: " + message);
    }
}
