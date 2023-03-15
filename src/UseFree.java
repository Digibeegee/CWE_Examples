public class UseFree {
            // Use After Free

        public static void main(String[] args) {

            UseFree obj = new UseFree();
            obj.msg();
            obj = null;
            System.gc();
            obj.msg();

        }
        void msg(){
            System.out.println("Greetings User");
        }
}
