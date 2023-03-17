package CWE287;

import java.util.Scanner;

public class CompliantTwitter {
    public static void main(String args[]){
        User admin= new User("Admin","pwd#0987");
        Scanner sc= new Scanner(System.in);
        String password=sc.nextLine();
        //adding maximum attempt limit so attacker cannot use brute force to guess password
        final int max_attempts=3;
        int attempt=1;
        while(!admin.validatePassword(password) && attempt<max_attempts){
            System.out.println("Wrong Password! Try Again");
            attempt+=1;
            password=sc.nextLine();
        }
        if(attempt>max_attempts)
            System.out.println("Account has been locked!");
        else
            System.out.println("Welcome "+admin.username);
    }
}
