package CWE862;

import java.util.Arrays;

public class CompliantMessageBoard {
    public void post(String message,String name){
        System.out.println(message+"\n:"+name);
    }

    public void read(){
        System.out.println("Reading messages from bulletin.......");
    }

    public static void main(String args[]){
        User user1= new User("Prerona","pwd123", Arrays.asList("read"));
        if (user1.username.equals(user1.getUsername())&& user1.password.equals(user1.getPassword())){
            System.out.println("User Verified");
            MessageBoard obj= new MessageBoard();
            obj.read();
            //checking permission list for special function authorization for each user
            if(user1.permissions.contains("write"))
                obj.post("User is authorized to post messages on board! Crisis averted!", user1.username);
            else
                System.out.println("Write Access not available for user:"+user1.username);
        }
    }
}
