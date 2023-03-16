package CWE287;

import java.util.Scanner;

public class Twitter {

    //Improper Authentication

    public static void main(String args[]){
        User admin= new User("Admin","pwd#0987");
        Scanner sc= new Scanner(System.in);
        String password=sc.nextLine();

        //no checking of maximum attempts gives attacker adequete time to guess password by brute force

        while(!admin.validatePassword(password)){
            System.out.println("Wrong Password! Try Again");
            password=sc.nextLine();
        }
    }
}
