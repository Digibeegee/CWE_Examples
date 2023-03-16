package CWE862;

import java.util.Arrays;

public class MessageBoard {

    //Improper Authorization

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

             //no authorization to check authorized access to functionalities

             MessageBoard obj= new MessageBoard();
             obj.read();
             obj.post("Attacker can exploit this weakness", user1.username);
         }
     }
}
