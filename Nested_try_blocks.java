public class Nested_try_blocks {
    public static void main(String[] args) {
        // Outer try block
        try {
            // Inner try block 1
            try {
                System.out.println("Going to divide by 0");
                System.out.println(100/0);
            }
            // catch block of Inner try block 1
            catch (ArithmeticException e) {
               System.out.println(e); 
            }

            // Inner try block 2
            try {
                int arr[] = new int[5];
                System.out.println(arr[10]);
            } 
            // catch block of Inner try block 2
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println("Other statement will be execute");
        }
        // catch block of outer try block
        catch (Exception e) {
            System.out.println("handled the exception");
        }

        System.out.println("Normal flow");
    }
}
