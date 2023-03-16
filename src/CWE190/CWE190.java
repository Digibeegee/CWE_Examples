package CWE190;

public class CWE190 {
    public static void main(String args[]){

        //Integer Overflow or Wraparound

        CWE190 obj= new CWE190();
        int a=90;
        System.out.println(obj.increment(a));
        System.out.println(obj.increment(Integer.MAX_VALUE));
        System.out.println(Integer.MIN_VALUE-1);
        System.out.println(Integer.MIN_VALUE);
    }

    private int increment(int a) {
        return a+1;
    }

}
