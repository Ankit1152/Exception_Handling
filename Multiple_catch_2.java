public class Multiple_catch_2{
    public static void main(String[] args) {
        try {
            int arr[] = {10,20,30,40,50};
            arr[5] = 100/0;
            System.out.println(arr[10]);

        } catch (ArithmeticException e1) {
            System.out.println(e1);
        }
        catch(NullPointerException e2){
            System.out.println(e2);
        }
        catch(ArrayIndexOutOfBoundsException e3){
            System.out.println(e3);
        }
        catch(Exception e4){
            System.out.println(e4);
        }
        System.out.println("rest of the code will be exected");
    }
}