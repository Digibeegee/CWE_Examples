public class OutOfBoundsWrite {
    public static void main(String args[]){
        int a[]=new int[5];
        for(int i=0;i<=5;i++){
            a[i]=i*10+(i-1);
            System.out.println(a[i]);
        }
    }
}
