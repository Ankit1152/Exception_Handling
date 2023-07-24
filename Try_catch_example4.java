public class Try_catch_example4 {
    public static void main(String[] args) {
        int i = 50;
        int j = 0;
        int data;

        try {
            data = i/j; // It may throw an exception
        }
        // handling an exception
         catch (Exception e) {
            // Resolving exception in catch block
            System.out.println(i/(j+2));
        }
    }
}
