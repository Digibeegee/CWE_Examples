import java.util.Scanner;

public class OutOfBoundsRead {
    final  int arr[]={-1,2,-3,4,-5};
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        OutOfBoundsRead obj=new OutOfBoundsRead();
        boolean read=true;
        while(read){
            System.out.println("Enter index to read:");
            int ele=sc.nextInt();
            System.out.println(obj.getValue(ele));
        }
    }

    private int getValue(int ele) {
        return arr[ele];
    }
}
