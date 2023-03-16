package CWE20;

import java.util.Scanner;

public class Compliant {
    final static int MAX_SIZE=100;
    public static void main(String[] args) {
        Integer width, height;
        Scanner sc = new Scanner(System.in);
        width = sc.nextInt();
        height = sc.nextInt();

        //checking for null,max size and 0
        if (width!=null && height != null) {
            if (width > MAX_SIZE || height > MAX_SIZE || width==0 || height==0)
                System.out.println("Value too large: Die evil hacker!");
            int board[][] = new int[width][height];
        }
    }
}
