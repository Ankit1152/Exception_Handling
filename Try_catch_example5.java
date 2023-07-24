public class Try_catch_example5 {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};

        try {
            System.out.println(arr[10]); // It may throw an exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("Rest of the code");
    }
}
