public class User {

    private String firstName;
    private String loginName;
    private String email;
    private String sms;

    public User(String firstName, String loginName) {
        this.firstName = firstName;
        this.loginName = loginName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLoginName() {
        return loginName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

//    @Override
//    public void update(String message) {
//        if(this.email != null || this.sms != null){
//             System.out.println(this.firstName + " get message: " + message);
//        }
//        else {
//            throw new RuntimeException(this.loginName + " needs to set email or sms.");
//        }
//    }
}
