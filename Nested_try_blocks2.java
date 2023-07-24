public class Nested_try_blocks2 {
    public static void main(String[] args) {
        try {
            try {
                try {
                    int arr[] = {1,2,3,4,5};

                    System.out.println(arr[10]);
                } 
                catch (ArithmeticException e1) { 
                    System.out.println(e1);
                }
            } 
            catch (ArithmeticException e2) {
                System.out.println(e2);
            }
        } 
        
        catch (ArrayIndexOutOfBoundsException e3) {
            System.out.println(e3);
        }
        catch(Exception e4){
            System.out.println(e4);
        }
    }
}
