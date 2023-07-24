// Finally block is such kind of block of code that will execute whether the exception will occur or not
public class Finally_block {
    public static void main(String[] args) {
        try {
            System.out.println("First this satement will execute");
            int data = 25/0;
            System.out.println(data);
        }

        // Exception occurs and handled by the catch block
        catch (ArithmeticException e) {
            System.out.println(e);
        }

        // Exception occurs but not handled by the catch block
        catch(NullPointerException e){
            System.out.println(e);
        }
        
        finally{
            System.out.println("Finally is a block of code that gets execute whether the exception will occur or not");
        }

        System.out.println("Rest of the code will be execute");
    }
}
