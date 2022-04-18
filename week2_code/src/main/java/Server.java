import java.util.ArrayList;
import java.util.List;

public class Server implements Subject{

    private List<User> usersList = new ArrayList<User>();

    @Override
    public void attach(User observer) {
        usersList.add(observer);
    }

    @Override
    public void detach(User observer) {
        usersList.remove(observer);
    }

    @Override
    public void sendNotification() {
        for (User user : usersList) {
            Notification.getInstance().sendMessage(user);
        }

    }
}
