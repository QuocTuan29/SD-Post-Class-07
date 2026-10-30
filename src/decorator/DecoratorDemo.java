package decorator;

/**
 * Demo chạy mẫu Decorator.
 * Trong Eclipse: Run As → Java Application
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        System.out.println("===== 1. Chỉ gửi Email =====");
        Notifier emailOnly = new EmailNotifier("user@example.com");
        emailOnly.send("Máy chủ CPU cao!");

        System.out.println("\n===== 2. Email + SMS =====");
        Notifier emailSms = new SMSDecorator(
                new EmailNotifier("user@example.com"),
                "+84-912-345-678"
        );
        emailSms.send("Máy chủ CPU cao!");

        System.out.println("\n===== 3. Email + SMS + Facebook + Slack (xếp chồng) =====");
        Notifier fullStack = new SlackDecorator(
                new FacebookDecorator(
                        new SMSDecorator(
                                new EmailNotifier("user@example.com"),
                                "+84-912-345-678"
                        ),
                        "nguyenvana"
                ),
                "alerts"
        );
        fullStack.send("NHÀ BẠN ĐANG CHÁY!!!");

        System.out.println("\n→ Client code chỉ làm việc với interface Notifier,");
        System.out.println("  không cần biết bên trong có bao nhiêu lớp decorator.");
    }
}
