package CWE798;

public class Compliant {
    //hard coded valuers are best avoided and if necessary, best stored in a seperate file
    public boolean VerifyAdmin(String password) {
        if (password.equals(Constant.admin_password)) {
            System.out.println("Admin Verified! Welcome.");
            return true;
        }
        System.out.println("Access Denied");
        return false;
    }

    public static void main(String args[]){
        Compliant obj=new Compliant();
        obj.VerifyAdmin("pwd1234");
    }
}
