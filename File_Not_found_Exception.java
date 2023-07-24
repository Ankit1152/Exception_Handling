import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class File_Not_found_Exception {
    public static void main(String[] args) {
        PrintWriter pw;

        try {
            pw = new PrintWriter("jtp.txt");   // may throw an exception
            pw.println("Saved");
        } 
        // Providing the checked exception handler
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        System.out.println("File saved Successfully");
    }
}
