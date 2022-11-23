public class RealtimeNotificationFactory extends AbstractNotificationFactory{

    Notification createNotification(String channelType) throws Exception {
        Notification notification = null;

        if(channelType.equalsIgnoreCase("sms")) {
            notification = new RealtimeSMSNotification();
        } else if(channelType.equalsIgnoreCase("email")) {
            notification = new RealtimeEmailNotification();
        } else if(channelType.equalsIgnoreCase("push")) {
            notification = new RealtimePushNotification();
        }

        return notification;
    }
}