package CWE190;

public class Compliant {
    public static void main(String args[]){

        //Integer Overflow or Wraparound

        Compliant obj= new Compliant();
        int a=90;
        System.out.println(obj.increment(a));
        System.out.println(obj.increment(Integer.MAX_VALUE));
        System.out.println(Integer.MIN_VALUE-1);
        System.out.println(Integer.MIN_VALUE);
    }

    private int increment(int a) {
        //method now returns -1 instead of having integer wraparound
        if(a<Integer.MAX_VALUE)
        return a+1;
        return -1;
    }
}
