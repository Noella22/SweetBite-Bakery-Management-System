package model;

import java.io.Serializable;

public class User implements Serializable {

    public static final long serialVersionUID = 1L;

    private int userId;

    private String fullname;
    private String username;
    private String email;
    private String password;
    private String role;

    public User() {
    }

    public User(int userId, String fullname, String username,
            String email, String password, String role) {

        this.userId = userId;
        this.fullname = fullname;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}