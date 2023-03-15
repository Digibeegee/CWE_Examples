public class IntegerOverflowWrap {
    public static void main(String args[]){
        IntegerOverflowWrap obj= new IntegerOverflowWrap();
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
