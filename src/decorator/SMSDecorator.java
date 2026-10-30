package decorator;

/**
 * Concrete Decorator – thêm hành vi gửi SMS.
 */
public class SMSDecorator extends NotifierDecorator {
    private final String phone;

    public SMSDecorator(Notifier notifier, String phone) {
        super(notifier);
        this.phone = phone;
    }

    @Override
    public void send(String message) {
        super.send(message);                     // gọi hành vi gốc (hoặc decorator bên trong)
        System.out.println("[SMS]   Gửi tới " + phone + ": " + message);
    }
}
