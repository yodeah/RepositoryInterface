package entity;

/**
 * Created by 212393105 on 2016.06.13..
 */
public class User {
    private String userName;
    private String password;
    private UserRole role;

    public User() {
    }

    public User(String userName, String password, UserRole role) {
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
