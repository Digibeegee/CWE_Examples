package CWE416;

public class Compliant {
    public static void main(String[] args) {

        //checking if object exists in memory to avoid exception

        Compliant obj = new Compliant();
        obj.msg();
        obj = null;
        System.gc();
        if(obj != null)
            obj.msg();
        else
            System.out.println("No Such object exists");
    }
    void msg(){
        System.out.println("Greetings User");
    }
}
