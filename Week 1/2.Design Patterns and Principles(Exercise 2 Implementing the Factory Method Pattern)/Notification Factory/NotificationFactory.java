public class NotificationFactory {
    public Notification createNotification(String type) {
        if (type == null || type.isEmpty()) return null;
        if (type.equalsIgnoreCase("SMS")) return new SMSNotification();
        if (type.equalsIgnoreCase("EMAIL")) return new EmailNotification();
        return null;
    }
}
