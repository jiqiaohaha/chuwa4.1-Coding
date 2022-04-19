public class Client {
    public static void main(String[] args) {
        Server server = new Server();
        User user1 = new User("aaa", "aaa");
        user1.setEmail("aaa@gmail.com");
        User user2 = new User("bbb", "bbb");
        user2.setSms("88888888");
        User user3 = new User("ccc", "ccc");
        user3.setEmail("ccc@qq.com");
        user3.setSms("00000000");
        User user4 = new User("ddd", "ddd");
        server.attach(user1);
        server.attach(user2);
        server.attach(user3);
        server.attach(user4);
        server.sendNotification();

    }
}
