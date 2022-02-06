import java.util.Scanner;

class errorname extends Exception {
    private double amount;

    public errorname(String msg) {
        super(msg);
    }
}
public class forthquestion {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        try{
            if(name != "abdur")
                throw new errorname("right name");
            System.out.println("right");
        }
        catch (Exception e1){
            e1.printStackTrace();
        }

    }
}
