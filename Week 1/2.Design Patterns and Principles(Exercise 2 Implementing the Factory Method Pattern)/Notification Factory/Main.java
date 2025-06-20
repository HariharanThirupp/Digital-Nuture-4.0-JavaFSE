public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification notif1 = factory.createNotification("EMAIL");
        notif1.notifyUser();

        Notification notif2 = factory.createNotification("SMS");
        notif2.notifyUser();
    }
}
