
public class User {

    private int userId;
    private String userName;

    //Constructor
    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void displayUser() {
        System.out.println("User ID: " + userId);
        System.out.println("User Name: " + userName);
        System.out.println("---------------------\n");
    }
}
