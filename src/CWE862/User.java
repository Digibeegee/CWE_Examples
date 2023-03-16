package CWE862;

import java.util.List;

public class User {
    String username;
    String password;
    List<String> permissions;

    public User(String username,String password,List<String> permissions) {
        this.username = username;
        this.password = password;
        this.permissions = permissions;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

}
