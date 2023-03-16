package CWE125;

import java.util.Scanner;

public class CWE125 {

    //out of bounds read

    final  int arr[]={-1,2,-3,4,-5};
    public static void main(String args[]) throws Exception{
        Scanner sc= new Scanner(System.in);
        CWE125 obj=new CWE125();
        boolean read=true;
        while(read){
            System.out.println("Enter index to read:");
            //attacker may attempt to read out of bounds
            int ele=sc.nextInt();
            System.out.println(obj.getValue(ele));
        }
    }

    private int getValue(int ele) {
        return arr[ele];
    }
}
