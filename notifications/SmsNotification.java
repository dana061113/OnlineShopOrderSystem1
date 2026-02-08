package notifications;

public class SmsNotification implements INotification {
    public void sendNotification(String message) {
        System.out.println("SMS уведомление: " + message);
    }
}
