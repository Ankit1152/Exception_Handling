public class Try_catch_example3 {
    public static void main(String[] args) {
        try {
            int data = 100/0;   // It may throw an exception
        }
        // handling exception by using parent or Exception class
        catch (Exception e) {
            // By deafult meassage to the user
            // System.out.println(e);

            // displaying custom message
            System.out.println("Can't divided by 0" +e);
        }
    }
}
