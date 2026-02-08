package notifications;

public class EmailNotification implements INotification {
    public void sendNotification(String message) {
        System.out.println("Email уведомление: " + message);
    }
}
