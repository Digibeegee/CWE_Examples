public class CWE787 {
    public static void main(String args[]){

        //Out of Bounds Write

        int a[]=new int[5];
        //attempts to write out of bounds in final iteration

        for(int i=0;i<=5;i++){
            a[i]=i*10+(i-1);
            System.out.println(a[i]);
        }
    }
}
