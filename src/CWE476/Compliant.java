package CWE476;

public class Compliant {
    public static void main(String args[]){

        //checking for available object before calling function on it

        String Name = null;
        if (Name != null)
        System.out.println(Name.length());
        else
            System.out.println("Enter value! Length of null object cannot be calculated!!");
    }
}
