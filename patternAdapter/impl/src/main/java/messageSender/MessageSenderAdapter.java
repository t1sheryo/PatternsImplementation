package messageSender;

import model.User;
import java.util.Map;

public class MessageSenderAdapter implements MultiplicatedMessageSender {
    private final MessageSender msgSender;

    public MessageSenderAdapter(MessageSender msgSender) {
        this.msgSender = msgSender;
    }

    @Override
    public void sendMessagesToUsers(Map<User, String> msgs) {
        msgs.entrySet().stream()
                .forEach(entry -> msgSender.sendMessage(entry.getKey(), entry.getValue()));
    }
}
