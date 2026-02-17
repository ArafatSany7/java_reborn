interface Notification {
    String notifyByUser(String Message);
}

class emailNotification implements Notification {
    public String notifyByUser(String m) {
        return "Messege for user " + m;
    }
}

class smsNotification implements Notification {
    public String notifyByUser(String m) {
        return "message for user " + m;
    }
}

class pushNotification implements Notification {
    public String notifyByUser(String m) {
        return "Messeage for user " + m;
    }
}

class NotificationFactory {
    public static Notification create(String method) {
        return switch (method) {
            case "email" -> new emailNotification();
            case "sms" -> new smsNotification();
            case "push" -> new pushNotification();
            default -> throw new IllegalArgumentException("Unknown Method" + method);
        };
    }
}

public class MonitoringEngine {
    public static void main(String[] args) {
        Notification email = NotificationFactory.create("email");
        Notification sms = NotificationFactory.create("sms");
        Notification push = NotificationFactory.create("push");

        System.out.println(email.notifyByUser("By a Email"));

        System.out.println(sms.notifyByUser("By SMS"));
    }
}
