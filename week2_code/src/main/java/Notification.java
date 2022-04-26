public class Notification {

    private Notification() {}
    private static Notification notification = new Notification();

    public static Notification getInstance() {
        return notification;
    }

    public void sendMessage(User user) {
        String message = "Hey " + user.getFirstName() + ", you have successfully registered to " +
                "add and here is your <" + user.getLoginName() +
                ">, please use this for future references.";
        if(user.getEmail() != null) {
            sendEmail(message);
        }
        if(user.getSms() != null) {
            sendSms(message);
        }
        if(user.getSms() == null && user.getEmail() == null) {
            throw new RuntimeException("Please set email/sms.");
        }
    }

    public void sendEmail(String message) {
        System.out.println("send email" + message);
    }

    public void sendSms(String message) {
        System.out.println("send sms" + message);
    }
}
