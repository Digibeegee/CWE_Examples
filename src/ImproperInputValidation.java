import java.util.Scanner;

public class ImproperInputValidation {
    final static int MAX_SIZE=100;
    public static void main(String[] args){
        int width,height;
        Scanner sc= new Scanner(System.in);
        width=sc.nextInt();
        height=sc.nextInt();
        if(width>MAX_SIZE||height>MAX_SIZE)
            System.out.println("Value too large: Die evil hacker!");
        int board[][]=new int[width][height];
    }
}
