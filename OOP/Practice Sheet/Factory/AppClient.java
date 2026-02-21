interface Notification {
    String showNotification(String notification);
}

class EmailNotifiaction implements Notification {
    public String showNotification(String n) {
        return "Sent notification via " + n;
    }
}

class SMSNotification implements Notification {
    public String showNotification(String n) {
        return "Sent notification via " + n;
    }
}

class PushNotification implements Notification {
    public String showNotification(String n) {
        return "Sent notification via " + n;
    }
}

class NotificationFactory {
    public static Notification create(String method) {
        return switch (method) {
            case "Email" -> new EmailNotifiaction();
            case "SMS" -> new SMSNotification();
            case "Push" -> new PushNotification();
            default -> throw new IllegalArgumentException(method);
        };
    }

}

public class AppClient {
    public static void main(String[] args) {

        Notification email = NotificationFactory.create("Email");
        Notification sms = NotificationFactory.create("SMS");
        Notification push = NotificationFactory.create("Push");

        System.out.println(email.showNotification("Email"));
        System.out.println(sms.showNotification("SMS"));
        System.out.println(push.showNotification("Push Message"));
    }
}
