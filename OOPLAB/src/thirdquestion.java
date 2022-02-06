import java.util.Scanner;

public class thirdquestion {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        try{
            System.out.println("String = " +name.charAt(0));
        }
        catch (Exception e1){
            e1.printStackTrace();
        }

    }
}
