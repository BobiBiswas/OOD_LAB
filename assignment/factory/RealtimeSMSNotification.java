public class RealtimeSMSNotification implements Notification{
    public void notifyUser(String text){
        System.out.println("sending realtime sms: " +text);
    }
}