import java.io.PrintStream;
import java.util.Scanner;
public class secondquestion {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        try {
            System.out.println("String = "+ name.charAt(8));
        }
        catch (Exception e1){
            e1.printStackTrace();
        }
    }
}
