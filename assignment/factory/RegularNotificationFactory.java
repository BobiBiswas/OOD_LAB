public class RegularNotificationFactory extends AbstractNotificationFactory{

    Notification createNotification(String channelType) throws Exception {
        Notification notification = null;

        if(channelType.equalsIgnoreCase("sms")) {
            notification = new SMSNotification();
        } else if(channelType.equalsIgnoreCase("email")) {
            notification = new EmailNotification();
        } else if(channelType.equalsIgnoreCase("push")) {
            notification = new PushNotification();
        }

        return notification;
    }
}