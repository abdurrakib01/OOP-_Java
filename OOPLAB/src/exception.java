public class exception {
    public static void main(String[] args){
        int x=0, y=0, z;
        try {
            System.out.println("z= "+(x/y));
        }
        catch (Exception e1){
            e1.printStackTrace();
        }
        finally {
            System.out.println("Done!");
        }
    }
}
