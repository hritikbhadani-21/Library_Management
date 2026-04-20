package Library_Management_System;

public class User {
    private int userId;
    private String Name;


    public User(int userId, String name) {
        this.userId = userId;
        Name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", Name='" + Name + '\'' +
                '}';
    }


}
