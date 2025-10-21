import messageSender.MessageSender;
import messageSender.MessageSenderAdapter;
import model.User;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<User, String> msgs = Map.of(
                new User("Timofey"), "Hello Timofey",
                new User("Artem"), "Hello Artem",
                new User("Ilya"), "Hello Ilya"
        );

        MessageSender sender = new MessageSender();
        MessageSenderAdapter adapter = new MessageSenderAdapter(sender);
        adapter.sendMessagesToUsers(msgs);
    }
}
