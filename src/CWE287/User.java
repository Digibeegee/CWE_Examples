package CWE287;

import java.util.List;

public class User {
    String username;
    String password;

    public User(String username,String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public boolean validatePassword(String pwd) {
       return  pwd.equals(getPassword());
    }
}

