public interface Subject {

    public void attach(User observer);

    public void detach(User observer);

    public void sendNotification();
}
