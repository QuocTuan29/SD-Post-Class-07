package decorator;

/**
 * Base Decorator – giữ tham chiếu đến component và ủy thác.
 */
public abstract class NotifierDecorator implements Notifier {
    protected final Notifier wrappee;

    public NotifierDecorator(Notifier notifier) {
        this.wrappee = notifier;
    }

    @Override
    public void send(String message) {
        wrappee.send(message);   // mặc định chỉ ủy thác
    }
}
