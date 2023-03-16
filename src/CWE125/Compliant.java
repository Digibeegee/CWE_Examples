package CWE125;

import java.util.Scanner;

public class Compliant { final static int arr[]={-1,2,-3,4,-5};
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        Compliant obj = new Compliant();
        boolean read = true;
        int ele = 0;

            while (read) {
                System.out.println("Enter index to read:");
                ele = sc.nextInt();
                //checking index before attempting read
                if(ele>=0 && ele<arr.length)
                   System.out.println(obj.getValue(ele));
                else
                    System.out.println("Invalid index");
                System.out.println("Read more?");
                read=sc.nextBoolean();
            }

    }

    public int getValue(int ele) {
        return arr[ele];
    }
}
