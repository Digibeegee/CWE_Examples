public class CWE798 {

    ////Hardcoded Credentials

        public boolean VerifyAdmin(String password) {
            if (password.equals("pwd1234")) {
                System.out.println("Admin Verified! Welcome.");
                return true;
            }
            System.out.println("Access Denied");
            return false;
        }

public static void main(String args[]){
            CWE798 obj=new CWE798();
            obj.VerifyAdmin("pwd1234");
}
}
