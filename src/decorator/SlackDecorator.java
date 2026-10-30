package decorator;

/**
 * Concrete Decorator – thêm hành vi gửi Slack.
 */
public class SlackDecorator extends NotifierDecorator {
    private final String channel;

    public SlackDecorator(Notifier notifier, String channel) {
        super(notifier);
        this.channel = channel;
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("[SLACK] Gửi tới #" + channel + ": " + message);
    }
}
