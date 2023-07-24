public class Try_catch_example2 {
    public static void main(String[] args) {
        try {
            int data = 100/0;
            // if exceptions occurs, the remaining statement wil not be executed
            System.out.println("Rest of the code");
        }
        // Handling the exception
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
