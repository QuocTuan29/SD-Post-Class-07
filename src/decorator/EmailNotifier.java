package decorator;

/**
 * Concrete Component – hành vi cơ bản: gửi email.
 */
public class EmailNotifier implements Notifier {
    private final String email;

    public EmailNotifier(String email) {
        this.email = email;
    }

    @Override
    public void send(String message) {
        System.out.println("[EMAIL] Gửi tới " + email + ": " + message);
    }
}
