public class Throw_keyword2 {
    public static void main(String[] args) {
        try {
            // Throw keyword is explicitlty used with the user defined or any Exception class to throw
            throw new UserDefinedException("This is a user defined exception");
        } catch (UserDefinedException ude) {
            System.out.println("Caught the exception");

            System.out.println(ude.getMessage());
        }
    }
}
class UserDefinedException extends Exception{
    public UserDefinedException(String str){
        super(str);
    }
}
