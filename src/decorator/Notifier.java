package decorator;

/**
 * Component interface – giao diện chung cho cả Notifier gốc và các Decorator.
 */
public interface Notifier {
    void send(String message);
}
