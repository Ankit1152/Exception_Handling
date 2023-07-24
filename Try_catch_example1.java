// Exception and Errors are two things or classes which inherits from Throwable Interface 
// Checked Exception :- are checked by compiler itself
// Unchecked Exception :- are not checked by compiler
// Int a = 100/0;                   ArithematicException
// String s = null;                 NullPointer exception

// String s = "abcdf";
// int s = Integer.parseInt(s);     NumberFormat Exception
// int arr[5] = {1,2,3,4,5,6};      ArrayindexOutOfBoundException

public class Try_catch_example1 {
    public static void main(String[] args) {
        try {
            // code that may raise exception
            int a = 100/0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        // Rest code of the program
        System.out.println("Rest of the code");
    }
}
