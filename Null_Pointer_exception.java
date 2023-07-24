public class Null_Pointer_exception {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        }
        catch(ArithmeticException e1) {
            System.out.println(e1);
        }
        catch(ArrayIndexOutOfBoundsException e2){
            System.out.println(e2);
        }
        catch(Exception e3){
            System.out.println(e3);
        }
        System.out.println("rest of the code will be executed");
    }
}
