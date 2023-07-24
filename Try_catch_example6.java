public class Try_catch_example6 {
    public static void main(String[] args) {
        try {
            int data1 = 100/0;

        }
        // We cannot keep an excepton code in catch block, it gives an error
         catch (Exception e) {
            int data2 = 10/0;
        }
        System.out.println("rest of the code will be executed");
    }
}
