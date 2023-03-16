package CWE416;

public class CWE416 {

            // Use After Free

        public static void main(String[] args) {

           CWE416 obj = new CWE416();
            obj.msg();
            obj = null;
            System.gc();
            obj.msg();

        }
        void msg(){
            System.out.println("Greetings User");
        }
}
