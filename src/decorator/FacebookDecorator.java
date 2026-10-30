package decorator;

/**
 * Concrete Decorator – thêm hành vi gửi Facebook notification.
 */
public class FacebookDecorator extends NotifierDecorator {
    private final String username;

    public FacebookDecorator(Notifier notifier, String username) {
        super(notifier);
        this.username = username;
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("[FB]    Gửi tới @" + username + ": " + message);
    }
}
