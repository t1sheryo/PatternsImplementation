package messageSender;

import model.User;
import java.util.Map;

public interface MultiplicatedMessageSender {
    public void sendMessagesToUsers(Map<User, String> messages);
}
