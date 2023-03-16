package CWE787;

public class Compliant {
    public static void main(String args[]){

        //checking index before write is attempted

        int a[]=new int[5];
        for(int i=0;i<=5;i++){
            if(i>=a.length)
            {System.out.println("Out of Bounds write detected");
            break;}
            a[i]=i*10+(i-1);
            System.out.println(a[i]);
        }
    }
}
